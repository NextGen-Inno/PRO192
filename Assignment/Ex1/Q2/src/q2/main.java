/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

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
        System.out.println("");
    }

    public static void duyetMang(int n) {
        System.out.print("The total value from 1 to " + n + " divisible by 3 is: ");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
