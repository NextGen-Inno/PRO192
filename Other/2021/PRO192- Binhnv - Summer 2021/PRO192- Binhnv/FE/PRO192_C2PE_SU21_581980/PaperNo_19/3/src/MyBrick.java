
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class MyBrick implements IBrick{

    @Override
    public int f1(List<Brick> t) {
        int number  = 0;
        ArrayList<String> list = new ArrayList<>();
        for (Brick brick : t) {
            list.add(brick.getPlace());
        }
        return number;
    }

    @Override
    public void f2(List<Brick> t) {
        int vtMax = 0;
        Brick max = t.get(0);
        int i = 0;
        for (Brick brick : t) {
            if (brick.getPrice() > max.getPrice() &&  brick.getPrice() % 2 ==1) {
                max = brick;
                vtMax = i;
            }
            i++;
        }
        t.get(vtMax).setPlace("XX");
        
    }

    @Override
    public void f3(List<Brick> t) {
        
        
    }
    public boolean isNumber(String str) {
        if (str.startsWith("1")) {
            return true;
        }else if(str.startsWith("2")){
            return true;
        }else if(str.startsWith("3")){
            return true;
        }else if(str.startsWith("4")){
            return true;
        }else if(str.startsWith("5")){
            return true;
        }else if(str.startsWith("6")){
            return true;
        }else if(str.startsWith("7")){
            return true;
        }else if(str.startsWith("8")){
            return true;
        }else if(str.startsWith("9")){
            return true;
        }else {
            return false;
        }
        
    }
}
