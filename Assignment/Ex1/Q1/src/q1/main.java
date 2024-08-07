/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

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
        System.out.print("The odd number from" + " 1 to " + n + ": ");
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.print("The even number from " + n + " to 0: ");
        for (int i = n; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
