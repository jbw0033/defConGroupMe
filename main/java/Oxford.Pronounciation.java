package groupmebot;

public class Pronounciation {
  private String audioFile;
  private String[] dialects;
  private String phoneticNotation;
  private String phoneticSpelling;
  private String[] regions;

  public Pronounciation() {}

  public String getAudioFile() {
    return audioFile;
  }

  public void setAudioFile(String audioFileIn) {
    this.audioFile = audioFileIn;
  }

  public String[] getDialects() {
    return dialects;
  }

  public void setDialects(String[] dialectsIn) {
    this.dialects = dialectsIn;
  }

  public String getPhoneticNotation() {
    return phoneticNotation;
  }

  public void setPhoneticNotation(String phoneticNotationIn) {
    this.phoneticNotation = phoneticNotationIn;
  }

  public String getPhoneticSpelling() {
    return phoneticSpelling;
  }

  public void setPhoneticSpelling(String phoneticSpellingIn) {
    this.phoneticSpelling = phoneticSpellingIn;
  }

  public String[] getRegions() {
    return regions;
  }

  public void setRegions(String[] regionsIn) {
    this.regions = regionsIn;
  }
}
