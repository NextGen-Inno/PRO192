/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SpecCala extends Cala {
    private int color;

    public SpecCala() {
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "," + color;
    }
    
    public void setData() {
        super.setOwner(super.getOwner().substring(0, 1) + "XX" + super.getOwner().substring(2));
    }
    
    public int getValue() {
        return color % 2 == 0 ? super.getPrice() + 7 : super.getPrice() + 3;
    }
}
