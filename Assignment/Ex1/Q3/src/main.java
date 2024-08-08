/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;

/**
 *
 * @author DUKE
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input n = ");
        n = sc.nextInt();
        duyetMang(n);
    }

    public static void duyetMang(int n) {
        int count = 0;
        System.out.print("Tne number of even numbers from 1 to " + n + " divisible by 3 is: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                count++;
            } 
        }
        System.out.println(count);
    }
}
