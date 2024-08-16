
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        String string[] = str.split(" ");
        int count = 0;
        for (String string1 : string) {
            if (string1.toLowerCase().endsWith("m") || string1.toLowerCase().endsWith("n")) {
                count ++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        ArrayList<String> list = new ArrayList<>();
        String word[] = str.split("\\s");
        for (String string1 : word) {
            list.add(string1);
        }
        int vtMax = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i+1).length() > list.get(i).length()) {
                vtMax = i+1;
            }
            
        }
        String temp = list.get(vtMax);
        String arr[] = temp.split("");
        String temp2 = "";
        for (int i = arr.length-1; i >=0 ; i--) {
            temp2 += arr[i];
            
        }
        list.set(vtMax, temp2);
        String result = "";
        for (String string : list) {
            result += string + " ";
        }
        return result.trim();
    }
    
}
