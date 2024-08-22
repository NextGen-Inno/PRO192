public class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Setter cho name
    public void setName(String name) {
        this.name = name;
    }

    // Getter cho price
    public double getPrice() {
        return price;
    }

    // Setter cho price
    public void setPrice(double price) {
        this.price = price;
    }

    // Phuong thuc toString() voi cau truc (name, price)
    @Override
    public String toString() {
        return String.format("(%s, %.2f VND)", name, price);
    }
}
