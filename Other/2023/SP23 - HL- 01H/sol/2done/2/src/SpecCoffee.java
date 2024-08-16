/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class SpecCoffee extends Coffee{
    private int price;

    public SpecCoffee() {
        super();
    }

    public SpecCoffee( String name, int size, int price) {
        super(name, size);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() +", " + price;
    }
    
    public void setData() {
        super.setName("CF" + super.getName());
    }
    
    public int getValue() {
        if (super.getSize() > 10) {
            return price;
        }else {
            return price + 5;
        }
    }
    
    
    
}
