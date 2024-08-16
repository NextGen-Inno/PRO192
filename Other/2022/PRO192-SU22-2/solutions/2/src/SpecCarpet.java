/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SpecCarpet extends Carpet {
    private int color;

    public SpecCarpet() {
    }

    public SpecCarpet(String maker, int size, int color) {
        super(maker, size);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }
    
    public void setData() {
        String maker = super.getMaker();
        super.setMaker(maker.substring(0, 2) + "HOA" + maker.substring(4));
    }
    
    public int getValue() {
        if (super.getSize() < 6)
            return color + 5;
        return color + 7;
    }
}
