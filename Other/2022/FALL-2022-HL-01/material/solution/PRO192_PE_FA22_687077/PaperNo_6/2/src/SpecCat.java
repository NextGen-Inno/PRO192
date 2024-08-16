/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class SpecCat extends Cat{
    private int nose;

    public SpecCat() {
        super();
    }

    public SpecCat(String area, int leg, int nose) {
        super(area, leg);
        this.nose = nose;
    }

    public int getNose() {
        return nose;
    }

    public void setNose(int nose) {
        this.nose = nose;
    }

    @Override
    public String toString() {
        return area + ", " + leg + ", " + nose;
    }
    
    public void setData() {
        String result = area.substring(0, area.length() - 1) + "BC" +
                area.substring(area.length() - 1);
        setArea(result);
    }
    
    public int getValue() {
        //check second character of area = 'X'
        if (area.charAt(1) == 'X') {
            //return nose + 9
            return nose + 9;
        }else {
            //otherwise return nose + 6
            return nose + 6;
        }
    }
    
    
    
    
}
