
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class MyCoffee implements ICoffee{

    @Override
    public int f1(List<Coffee> t) {
        int count = 0;
        for (Coffee coffee : t) {
            if (!(coffee.getName().contains("A") && coffee.getName().contains("B"))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Coffee> t) {
        Coffee max = t.get(0);
        for (Coffee coffee : t) {
            if (coffee.getSize() > max.getSize()) {
                max = coffee;
            }
        }
        t.remove(max);
    }

    @Override
    public void f3(List<Coffee> t) {
        Collections.sort(t.subList(0, 2), new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {
                int unitDigitO1 = getUnit(o1.getSize());
                int unitDigitO2 = getUnit(o2.getSize());
                return unitDigitO2 - unitDigitO1;
            }

        });
    }
     public int getUnit(int leg) {
//        //convert sang chuoi
//        String a = String.valueOf(leg);
//        //lay ra phan tu vi tri cuoi cung
//        a = a.substring(a.length() - 1);
//        //convert no ve int
//        return Integer.parseInt(a);
        return leg % 10;
    }
    
}
