package groupmebot;

public class Sense {
  private String[] crossReferenceMarkers;
  private XReference[] crossReferences;
  private String[] definitions;
  private String[] domains;
  private Example[] examples;
  private String id;
  private CategorizedText[] notes;
  private Pronounciation[] pronounciations;
  private String[] regions;
  private String[] registers;
  private Sense[] subsenses;
  private Translation[] tranlations;
  private Variant[] variantForms;

  public Sense() {}

  public String[] getCrossReferenceMarkers() {
    return crossReferenceMarkers;
  }

  public void setCrossReferenceMarkers(String[] crossReferenceMarkersIn) {
    this.crossReferenceMarkers = crossReferenceMarkersIn;
  }

  public XReference[] getCrossReferences() {
    return crossReferences;
  }

  public void setCrossReferences(XReference[] crossReferencesIn) {
    this.crossReferences = crossReferencesIn;
  }

  public String[] getDefinitions() {
    return definitions;
  }

  public void setDefintions(String[] definitionsIn) {
    this.defintions = definitionsIn;
  }

  public String[] getDomains() {
    return domains;
  }

  public void setDomains(String[] domainsIn) {
    this.domains = domainsIn;
  }

  public Example[] getExamples() {
    return examples;
  }

  public void setExamples(Example[] examplesIn) {
    this.examples = examplesIn;
  }

  public String getId() {
    return id;
  }

  public void setId(String idIn) {
    this.id = idIn;
  }

  public CategorizedText[] getNotes() {
    return notes;
  }

  public void setNotes(CategorizedText[] notesIn) {
    this.notes = notesIn;
  }

  public Pronounciation[] getPronounciations() {
    return pronounciations;
  }

  public void setPronounciations(Pronounciation[] pronounciationsIn) {
    this.pronounciations = pronounciationsIn;
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

  public Sense[] getSubsenses() {
    return subsenses;
  }

  public void setSubsenses(Sense[] subsensesIn) {
    this.subsenses = subsensesIn;
  }

  public Translation[] getTranslations() {
    return translations;
  }

  public void setTranslations(Translation[] translationsIn) {
    this.translations = translantionsIn;
  }

  public Variant[] getVariantForms() {
    return variantForms;
  }

  public void setVariantForms(Variant[] variantFormsIn) {
    this.variantForms = variantFormsIn;
  }
}
