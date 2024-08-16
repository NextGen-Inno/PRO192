/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class SpecCar extends Car{
    private int warranty;

    public SpecCar() {
        super();
    }

    public SpecCar(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        //check if name is "AUDI"
        //return warranty + 5
        if (name.equals("AUDI")) {
            return warranty + 5;
        //otherwise return warranty + 2
        }else {
            return warranty + 2;
        }
        
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return name +", " + price + ", " + warranty;
    }
    
    
    
    
    
}
