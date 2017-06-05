package groupmebot;

import java.net.URL;
import java.io.*;
import javax.net.ssl.HttpsURLConnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroupMeBot {

  private static int jayIsABitch = 0;
  private int isJayABitch = false;

  private String queue = "!def";

  private final String BOT_BOY = "Bot Boy";

  private final String LANG = "en";

  private final String OXFORD_BASE = "https://od-api.oxforddictionaries.com:443/api/v1/entries/" + LANG + "/";
  private final String GROUPME_BASE = "";

  private final String GROUPME_TOKEN = "";
  private final String GROUP_ID = "";

  private final String OXFORD_API_KEY = "";
  private final String OXFORD_ID = "";







  public static void main(String[] args) {
    SpringApplication.run(Bot.class);
  }

  private void registerBot() {

  }

  private void parseCallBack() {

  }

  private void getDefinition(String word) {

  }

  private void respondToGroup() {

  }
}
