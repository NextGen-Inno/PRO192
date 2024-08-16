package view;

import controller.CompanyManagement;
import controller.Validate;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> mChon;
    public Validate val = new Validate();

    public Menu() {
    }

    public Menu(String tieuDe, String[] multichoice) {
        title = tieuDe;
        mChon = new ArrayList<>();
        for (String string : multichoice) {
            mChon.add((T) string);
        }
    }
//------------------------------------------------------------
    public void display() {
        System.out.println(title);
        System.out.println("---");
        for (int i = 0; i < mChon.size(); i++) {
            System.out.println((i + 1) + ". " + mChon.get(i));
        }
        System.out.println("---");
    }
//------------------------------------------------------------
    public int getSelected() {
        display();
        int num = val.checkInt(val.inputString("Enter selection.. "));
        while (true) {            
            if(num == -1){
                num = val.checkInt(val.inputString("Enter selection.. "));
            }else break;
        }
        System.out.println("");
        return num;
    }
//------------------------------------------------------------
    public abstract void execute(int n);
//------------------------------------------------------------
    public void run() {
        while (true) {
            int n = getSelected();
            execute(n);
            if(n>mChon.size() || n==0){
                System.out.println("Value out of range!!! Try again");
                System.out.println("");
                continue;
            }
            if(n==mChon.size()){
                break;
            }
        }
    }
}
