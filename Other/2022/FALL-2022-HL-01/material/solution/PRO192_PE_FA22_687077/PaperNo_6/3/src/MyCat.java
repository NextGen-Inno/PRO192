
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class MyCat implements ICat {

    @Override
    public int f1(List<Cat> list) {
        int count = 0;
        for (Cat cat : list) {
            if (cat.getArea().contains("A") || cat.getArea().contains("B")) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cat> list) {
        Cat secondMaxCat = null;
        List<Cat> listNew = new ArrayList<>();
        //add all
        listNew.addAll(list);
        //sort
        Collections.sort(listNew, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o2.getLeg() - o1.getLeg();
            }
        });
        //lay ra phan tu co leg lon nhat
        Cat maxLegCat = listNew.get(0);
        int count = 0;
        for (Cat cat : listNew) {
            if (cat.getLeg() == maxLegCat.getLeg()) {
                count++;
            }
            if (count == 2) {
                secondMaxCat = cat;
                break;
            }
        }

        //xoa
        list.remove(secondMaxCat);
    }

    @Override
    public void f3(List<Cat> list) {
        Collections.sort(list.subList(0, 4), new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                int unitDigitO1 = getUnit(o1.getLeg());
                int unitDigitO2 = getUnit(o2.getLeg());
                return unitDigitO1 - unitDigitO2;
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
