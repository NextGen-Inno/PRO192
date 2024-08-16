/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class MyClass implements IProcess {

    @Override
    public long factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public String checkString(String string) {
        //kiem tra chuoi truyen vao co bat dau bang HD 
        //hay la hd va so luong ki tu co bang 8 hay la khong
        boolean test = (string.startsWith("HD") || string.startsWith("hd"))
                && string.length() == 8;
        if (test) {
            String temp = string.substring(2);
            //toan bo la chu so
            if (temp.matches("[0-9]+")) {
                return "Success";
                //khong phai
            } else {
                return "Fail";

            }
        } else {
            return "Fail";
        }
    }

}
