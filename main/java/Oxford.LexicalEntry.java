package groupmebot;

public class LexicalEntry {
  private RelatedEntry[] derivativeOf;
  private Entry[] entries;
  private GrammaticalFeatures[] grammaticalFeatures;
  private String language;
  private String lexicalCategory;
  private CategorizedText[] notes;
  private Pronounciation[] pronounciations;
  private String text;
  private Variant[] variantForms;

  public LexicalEntry() {}

  public RelatedEntry[] getRelatedEntries() {
    return derivativeOf;
  }

  public void setRelatedEntries(RelatedEntry[] derivativeOfIn) {
    this.derivativeOf = derivativeOfIn;
  }

  public Entry[] getEntries() {
    return entries;
  }

  public void setEntries(Entry[] entriesIn) {
    this.entries = entriesIn;
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

  public void setLanguage(String languageIn) {
    this.language = languageIn;
  }

  public String getLexicalCategory() {
    return lexicalCategory;
  }

  public void setLexicalCategory(String lexicalCategoryIn) {
    this.lexicalCategory = lexicalCategoryIn;
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

  public String getText() {
    return text;
  }

  public void setText(String textIn) {
    this.text = textIn;
  }

  public Variant[] getVariantForms() {
    return variantForms;
  }

  public void setVariantForms(Variant[] variantFormsIn) {
    this.variantForms = variantFormsIn;
  }
}
