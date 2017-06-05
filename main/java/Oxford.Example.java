package groupmebot;

public class Example {
  private String[] definitions;
  private String[] domains;
  private CategorizedText[] notes;
  private String[] regions;
  private String[] registers;
  private String[] senselds;
  private String text;
  private Translation[] translations;

  public Example() {}

  public String[] getDefinitions() {
    return definitions;
  }

  public void setDefinitions(String[] defintionsIn) {
    this.definitons = definitionsIn;
  }

  public String[] getDomains() {
    return domains;
  }

  public void setDomains(String[] domainsIn) {
    this.domains = domainsIn;
  }

  public CategorizedText[] getNotes() {
    return notes;
  }

  public void setNotes(CategorizedText notesIn) {
    this.notes = notesIn;
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

  public String[] getSenselds() {
    return senselds;
  }

  public void setSenselds(String[] senseldsIn) {
    this.senselds = senseldsIn;
  }

  public String getText() {
    return text;
  }

  public void setText(String textIn) {
    this.text = textIn;
  }

  public Translation[] getTranslations() {
    return translations;
  }

  public void setTranslations(Translation[] translationsIn) {
    this.translations = translationsIn;
  }
}
