package groupmebot;

import oxford.*;

import java.io.*;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.util.Scanner;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.ClientProtocolException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class GroupMeBot {

  private String queue = "!definition";

  private static final String BOT_BOY = "G Baby";
  private static final GroupMeGroup[] EMPTY_GMG = {};

  private static final String GROUPME_BASE = "https://api.groupme.com/v3/bots/post";
  private static String BOT_ID = "767b696698d4409da9d87107b7";

  private static String GROUPME_TOKEN = "";
  private static String GROUP_ID = "32289600";

  @RequestMapping(value="/groupmebot", method=RequestMethod.POST, consumes="application/json")
  public void groupMeCallback(@RequestBody GroupMeCallback gmcb) {

    String[] text = gmcb.getText().split(" ");

    boolean found = false;
    String wordToDefine = "";

    for (String word : text) {

      if (word.equals(queue))
        found = true;

      if (found) {
        wordToDefine = word;
        break;
      }
    }

    if (found && !wordToDefine.equals("")) {
      found = false;
      respondToGroup(Oxford.getDefinition(wordToDefine));
    }
  }

  private void respondToGroup(String response) {

    DefaultHttpClient dhc = new DefaultHttpClient();

    GroupMeTextResponse gmtr = new GroupMeTextResponse(BOT_ID, response);

    ObjectMapper mapper = new ObjectMapper();

    StringEntity strEntity;

    try {
      strEntity = new StringEntity(mapper.writeValueAsString(gmtr));
    } catch (JsonProcessingException e) {
      return;
    } catch (UnsupportedEncodingException e) {
      return;
    }


    HttpPost post = new HttpPost(GROUPME_BASE);
    post.addHeader("Content-Type", "application/json");
    post.setEntity(strEntity);

    try {

      HttpResponse resp = dhc.execute(post);

      if (resp.getStatusLine().getStatusCode() != 200) {
  			throw new RuntimeException("Failed : HTTP error code : "
  			   + resp.getStatusLine().getStatusCode());
  		}
    } catch (ClientProtocolException e) {

	    e.printStackTrace();

	  } catch (IOException e) {

	    e.printStackTrace();

	  }
  }

  public static void main(String[] args) {

    System.out.println("Configure? (y/n): ");

    Scanner scn = new Scanner(System.in);

    String ans = scn.nextLine().trim().toLowerCase();

    if (ans.equals("y")) {
      configure();
      System.out.println("Configuration successful");
    }

    SpringApplication.run(GroupMeBot.class);
  }

  private static GroupMeGroup[] getGroups() {

    DefaultHttpClient dhc = new DefaultHttpClient();

    String url = "https://api.groupme.com/v3/groups?token=" + GROUPME_TOKEN;

    HttpGet get = new HttpGet(url);

    try {

      HttpResponse resp = dhc.execute(get);

      if (resp.getStatusLine().getStatusCode() != 200) {
  			throw new RuntimeException("Failed : HTTP error code : "
  			   + resp.getStatusLine().getStatusCode());
  		}

      BufferedReader br = new BufferedReader(
                           new InputStreamReader((resp.getEntity().getContent())));

  		ObjectMapper objm = new ObjectMapper();

      GroupMeGroup[] gmg = objm.readValue(br, GroupMeGroup[].class);

      return gmg;

    } catch (ClientProtocolException e) {

	    e.printStackTrace();

      return EMPTY_GMG;

	  } catch (IOException e) {

	    e.printStackTrace();

      return EMPTY_GMG;

	  }
  }

  private static String confirmGroup() {
    DefaultHttpClient dhc = new DefaultHttpClient();

    ObjectMapper mapper = new ObjectMapper();


    HttpPost post = new HttpPost("https://api.groupme.com/v3/bots?token=" + GROUPME_TOKEN);
    post.addHeader("Content-Type", "application/json");

    try {
      post.setEntity( new StringEntity( mapper.writeValueAsString( new GroupMeConfirmation() ) ) );

      HttpResponse resp = dhc.execute(post);

      if (resp.getStatusLine().getStatusCode() != 200) {
  			throw new RuntimeException("Failed : HTTP error code : "
  			   + resp.getStatusLine().getStatusCode());
  		}

      BufferedReader br = new BufferedReader(
                           new InputStreamReader((resp.getEntity().getContent())));

      GroupMeConfirmationResponse gmcr = mapper.readValue(br, GroupMeConfirmationResponse.class);

      return gmcr.getBotId();

    } catch (ClientProtocolException e) {

	    e.printStackTrace();

      return "";

	  } catch (IOException e) {

	    e.printStackTrace();

      return "";

	  }
  }

  private static void configure() {

    System.out.println("Token ID: ");

    Scanner scn = new Scanner(System.in);

    GROUPME_TOKEN = scn.nextLine().trim().toLowerCase();

    GroupMeGroup[] gmg = getGroups();

    int index = 1;

    for (GroupMeGroup group : gmg) {
      System.out.println(index++ + ") " + group.getId());
    }

    while (true) {

      System.out.println("Which group number do you want to be added to?: ");

      String tmp = scn.nextLine().trim().toLowerCase();

      int choice = Integer.parseInt(tmp);

      System.out.println("Are you sure you want to be added to " + gmg[choice+1].getId() + "? (y/n): ");

      String ans = scn.nextLine().trim().toLowerCase();

      if (ans.equals("y")) {
        GROUP_ID = gmg[choice+1].getGroupId();
        break;
      }
    }
    BOT_ID = confirmGroup();
  }

  static class GroupMeGroup {
    String id;
    String groupId;

    public GroupMeGroup() {}

    public void setId(String idIn) {
      id = idIn;
    }

    public void setGroupId(String groupIdIn) {
      groupId = groupIdIn;
    }

    public String getId() {
      return id;
    }

    public String getGroupId() {
      return groupId;
    }
  }

  static class GroupMeConfirmation {
    private String name = BOT_BOY;
    private String groupId = GROUP_ID;

    public GroupMeConfirmation() {}

    public String getName() {
      return name;
    }

    public String getGroupId() {
      return groupId;
    }
  }

  class GroupMeConfirmationResponse {
    private String name;
    private String botId;

    public GroupMeConfirmationResponse() {}

    public void setName(String nameIn) {
      this.name = nameIn;
    }
    public void setBotId(String botIdIn) {
      this.botId = botIdIn;
    }
    public String getName() {
      return this.name;
    }
    public String getBotId() {
      return this.botId;
    }
  }
}
