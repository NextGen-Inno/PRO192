public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int discount;

    // Default constructor
    public Product() {
    }

    // Constructor with parameters
    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    // Set discount
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // Calculate subtotal
    public double subTotal() {
        double subtotal = quantity * price * (100 - discount) / 100;
        return subtotal;
    }
}
