
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
public class MyCarp implements ICarp {

    @Override
    public int f1(List<Carp> t) {
        int count = 0;
        for (Carp c : t) {
            if (Character.isDigit(c.getPond().charAt(1))
                    && Integer.parseInt(c.getPond().charAt(1) + "") % 2  == 0)
                count++;
        }
        
        return count;
    }
    
    boolean isPalin(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    @Override
    public void f2(List<Carp> t) {
        for (Carp c : t) {
            if (isPalin(c.getPond())) {
                c.setState(99);
                break;
            }
        }
    }

    @Override
    public void f3(List<Carp> t) {
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {
                if (t.get(j).getState() > t.get(j+1).getState())
                    Collections.swap(t, j, j+1);
                else if (t.get(j).getState() == t.get(j+1).getState()) {
                    if (t.get(j).getPond().charAt(1) > t.get(j+1).getPond().charAt(1))
                        Collections.swap(t, j, j+1);
                }
            }
        }
    }
    
}
