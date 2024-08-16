public class WordData extends Factory implements IConnect {
  private String content;

  public WordData(String type, String dataSource) {
    super(type, dataSource);
    this.content = "this is a string";
  }

  @Override
  public boolean makeConnection() {
    if (this.dataSource.contains("localhost:8080")) {
      return true;
    }
    return false;
  }

  @Override
  public void readData() {
    if (this.type.endsWith("doc")) {
      this.content = "humpty dumpty sat on the wall";
    }
  }

  @Override
  public String writeData() {
    String[] words = this.content.split("\\s+");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
      String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
      result.append(capitalizedWord).append(" ");
    }
    return result.toString().trim();
  }
}