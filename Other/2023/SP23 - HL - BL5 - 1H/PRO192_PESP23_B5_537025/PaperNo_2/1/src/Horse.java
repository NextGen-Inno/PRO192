public class Horse {
    private String name;
    private int weight;

    public Horse() {
    }

    public Horse(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        String result = name + name.length();
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
