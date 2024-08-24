public class Item {
    private String name;
    private int quantity;
    private String status;

    

    public Item() {
        this.name = "";
        this.quantity = 0;
        this.status = "N/A";
    }

    public Item(String name, int quantity) {
        this.name = name;
        if (quantity < 0) {
            this.quantity = 0;
            this.status = "N/A";
        } else {
            this.quantity = quantity;
            this.status = "A";
        }
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
            this.status = "N/A";
        } else {
            this.quantity = quantity;
            this.status = "A";
        }
    }

    @Override
    public String toString() {
        return name.toUpperCase() + "," + quantity + "," + status;
    }
}
