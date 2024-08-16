/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class MyString implements IString {
    
    @Override
    public int f1(String str) {
        int count = 0;
        String[] array = str.split("\\s");
        for (String string : array) {
            //kiem tra string co chua 2 digit hay khong
            boolean isHave2digit = checkHave2Digit(string);
            if (isHave2digit == true) {
                count++;
            }
        }
        return count;
    }
    
    @Override
    public String f2(String str) {
        String[] array = str.split("\\s");
        //tim ra first word xuat hien ben trong str 3 lan
        String firstWord = handleF2(array, str);
//        
//        //replace "V"
        str = str.replaceAll(firstWord, "V");
        return str;
    }
    
    private boolean checkHave2Digit(String string) {
        char[] array = string.toCharArray();
        int count = 0;
        for (char c : array) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
    
    private String handleF2(String[] array, String str) {
//        for (String string : array) {
//            int count = 0;
//            for (String string1 : array) {
//                if (string.equals(string1)) {
//                    count++;
//                }
//                if (count == 3) {
//                    return string;
//                }
//            }
//        }
//        return null;
//        for (String string : array) {
//            int count = (str.split(string, -1).length) - 1;
//            if (count == 3) {
//                return string;
//            }
//        }
//        return null;
//    }
    
}
