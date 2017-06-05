package groupmebot;

public class GrammaticalFeatures {
  private String text;
  private String type;

  public GrammaticalFeatures() {}

  public String getText() {
    return text;
  }

  public void setText(String textIn) {
    this.text = textIn;
  }

  public String getType() {
    return type;
  }

  public void setType(String typeIn) {
    this.type = typeIn;
  }
}
