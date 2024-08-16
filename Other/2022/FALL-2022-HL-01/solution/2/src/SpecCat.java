/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SpecCat extends Cat {
    private int nose;

    public SpecCat() {
    }

    public SpecCat(String area, int leg,  int nose) {
        super(area, leg);
        this.nose = nose;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + nose;
    }
    
    public void setData() {
        String area = super.getArea();
        super.setArea(area.substring(0, area.length() - 1) + "BC" + area.substring(area.length() - 1));
    }
    
    public int getValue() {
        if (super.getArea().charAt(1) == 'X')
            return nose + 9;
        return nose + 6;
    }
    
}
