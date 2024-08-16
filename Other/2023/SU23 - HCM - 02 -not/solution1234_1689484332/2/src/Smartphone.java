
public class Smartphone extends Product {

    private int internal_memory;
    private float weight;
    private int price;

    public Smartphone(String code, String name, int internalMemory, float weight, int price) {
        super(code, name);
        this.internal_memory = internalMemory;
        this.weight = weight;
        this.price = price;
    }

    public void showInfor() {
        System.out.println(code + "-" + name + "-" + internal_memory + "GB-" + weight + "g-" + price + "$");
    }

    public double buyNow(int quantity) {
        if (name.equals("IPHONE 14 PROMAX") && quantity >= 5) {
            double discountedPrice = price * quantity * 0.8; // 20% off
            return discountedPrice;
        } else {
            double totalPayment = price * quantity;
            return totalPayment;
        }
    }
}
