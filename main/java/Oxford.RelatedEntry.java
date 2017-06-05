package groupmebot;

public class RelatedEntry {
  private String[] domains;
  private String id;
  private String language;
  private String[] regions;
  private String[] registers;
  private String text;

  public RelatedEntry() {}

  public String[] getDomains() {
    return domains;
  }

  public void setDomains(String[] domainsIn) {
    this.domains = domainsIn;
  }

  public String getId() {
    return id;
  }

  public void setId(String idIn) {
    this.id = idIn;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String languageIn) {
    this.language = languageIn;
  }

  public String[] getRegions() {
    return regions;
  }

  public void setRegions(String[] regionsIn) {
    this.regions = regionsIn;
  }

  public String[] getRegisters() {
    return registers;
  }

  public void setRegisters(String[] registersIn) {
    this.registers = registersIn;
  }

  public String getText() {
    return text;
  }

  public void setText(String textIn) {
    this.text = textIn;
  }
}
