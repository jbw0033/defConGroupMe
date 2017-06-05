package groupmebot;

public class Variant {
  private String[] regions;
  private String text;

  public Variant() {}

  public String[] getRegions() {
    return regions;
  }

  public void setRegions(String[] regionsIn) {
    this.regions = regionsIn;
  }

  public String getText() {
    return text;
  }

  public void setText(String textIn) {
    this.text = textIn;
  }
}
