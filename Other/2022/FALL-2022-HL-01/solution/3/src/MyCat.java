
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyCat implements ICat {

    @Override
    public int f1(List<Cat> list) {
        int count = 0;
        for (Cat c : list) {
            if (c.getArea().contains("A") || c.getArea().contains("B")) count++;
        }
        return count;
    }

    @Override
    public void f2(List<Cat> list) {
        int max = Integer.MIN_VALUE;
        for (Cat c : list) {
            if (c.getLeg() > max) max = c.getLeg();
        }
        
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLeg() == max) count++;
            if (count == 2) list.remove(i);
        }
    }

    @Override
    public void f3(List<Cat> list) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                if (list.get(j).getLeg() % 10 > list.get(j+1).getLeg() % 10) {
                    Collections.swap(list, j, j+1);
                }
            }
        }
    }
    
}
