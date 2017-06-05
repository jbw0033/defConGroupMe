package groupmebot;

public class Translation {
  private String[] domains;
  private GrammaticalFeatures[] grammaticalFeatures;
  private String language;
  private CategorizedText[] notes;
  private String[] regions;
  private String[] registers;
  private String text;

  public Translation() {}

  public String[] getDomains() {
    return domains;
  }

  public void setDomains(String[] domainsIn) {
    this.domains = domainsIn;
  }

  public GrammaticalFeatures[] getGrammaticalFeatures() {
    return grammaticalFeatures;
  }

  public void setGrammaticalFeatures(GrammaticalFeatures[] grammaticalFeaturesIn) {
    this.grammaticalFeatures = grammaticalFeaturesIn;
  }

  public String getLanguage() {
    return language;
  }

  public void setLangauge(String languageIn) {
    this.language = languageIn;
  }

  public CategorizedText[] getNotes() {
    return notes;
  }

  public void setNotes(CategorizedText[] notesIn) {
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

  public String getText() {
    return text;
  }

  public void setText(String textIn) {
    this.text = textIn;
  }
}
