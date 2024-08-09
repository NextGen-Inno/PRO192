/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        inputArray(a);
        coutTime(a);
    }

    public static void inputArray(int[] a) {
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sn.nextInt();
        }
    }

    public static void coutTime(int[] a) {
        System.out.println("Enter the integer number k to count its occurrences: ");
        Scanner ct = new Scanner(System.in);
        int t = ct.nextInt();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                count++;
            }
        }
        System.out.println("The number " + t + " occurs " + count + " times in the array.");
    }

}
