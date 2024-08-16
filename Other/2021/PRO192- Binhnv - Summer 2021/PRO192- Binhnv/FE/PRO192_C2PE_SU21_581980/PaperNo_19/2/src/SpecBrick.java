/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class SpecBrick extends Brick{
    protected int color;

    public SpecBrick() {
        super();
    }


    public SpecBrick(String place, int price , int color) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+", " + color; //To change body of generated methods, choose Tools | Templates.
    }
    public int getValue(){
        int result = 0;
        if (color > 7) {
            result = super.getPrice() + 9;
        }else {
            result = super.getPrice() + 6;
        }
        return result;
    }
    
    
    
    
    
}
