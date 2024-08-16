
public class SpecFish extends Fish {

    private int price;

    public SpecFish() {
    }

    public SpecFish(String name, int weight, int price) {
        super(name, weight);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setData() {
        String str = super.getName().substring(0, super.getName().length() - 1);
        setName(str);
    }
    
    public int getValue() {
        if (super.getWeight() % 2 != 0) {
            return price;
        }else {
            return price + super.getWeight();
        }
    }

    @Override
    public String toString() {
        return super.getName() + ", " + price + ", " + super.getWeight();
    }

}
