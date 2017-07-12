package groupmebot;

public class GroupMeTextResponse {
  private String botId = "";
  private String text = "";

  public GroupMeTextResponse(String botIdIn, String textIn) {
    botId = botIdIn;
    text = textIn;
  }

  public String getBotId() {
    return botId;
  }

  public void setBotId(String botIdIn) {
    botId = botIdIn;
  }

  public String getText() {
    return text;
  }

  public void setText(String textIn) {
    text = textIn;
  }
}
