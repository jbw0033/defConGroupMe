package groupmebot;

public class HeadwordEntry {

  private String id;
  private String language;
  private LexicalEntry[] lexicalEntries;
  private Pronounciation[] pronounciations;
  private String type;
  private String word;

  public HeadwordEntry() {}

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

  public LexicalEntry[] getLexicalEntries() {
    return lexicalEntries;
  }

  public void setLexicalEntries(LexicalEntry[] lexicalEntries) {
    this.lexicalEntries = lexicalEntriesIn;
  }

  public Pronounciation[] getPronounciations() {
    return pronounciations;
  }

  public void setPronounciations(Pronounciation[] pronounciationsIn) {
    this.pronounciations = pronounciationsIn;
  }

  public String getType() {
    return type;
  }

  public void setType(String typeIn) {
    this.type = typeIn;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String wordIn) {
    this.word = wordIn;
  }
}
