/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DUKE
 */
package MyArray;

public class Main {

    public static void main(String[] args) {
        int[] arrint = {4, 34, 81, 5, 63, 9, 15, 2, 7, 50};
    }

    public static void disArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("");
    }
    
    public static void delElement(int[] a, int pos) {
        if(pos<0 || pos>=a.length) return;
        for (int i = pos; i < a.length; i++) {
            a[pos]=a[pos+1];
        }
    }
}
