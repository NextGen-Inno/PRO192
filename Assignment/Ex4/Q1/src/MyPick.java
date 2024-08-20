public class MyPick {
    private String name;
    private int weight;

    public MyPick() {
    }

    public MyPick(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        if (name.length() == 0) {
            return "";
        }
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        return "" + lastChar + firstChar;
    }

    public void setWeight(int weight) {
        if (weight % 2 == 0) {
            this.weight = weight * 2;
        } else {
            this.weight = weight;
        }
    }

    public String getNameValue() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }
    
    public void Menu() {
        System.out.println("---o0o---");
        System.out.println("1. Test case 1");
        System.out.println("2. Test case 2");
        System.out.println("3. Quit");
        System.out.print("What is your choise: ");
    }

}
