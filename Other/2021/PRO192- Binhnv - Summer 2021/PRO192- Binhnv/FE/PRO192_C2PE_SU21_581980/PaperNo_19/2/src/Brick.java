/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class Brick {
    protected String place;
    protected int price;

    public Brick() {
    }

    public Brick(String place, int price) {
        this.place = place;
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return place +", " + price; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
