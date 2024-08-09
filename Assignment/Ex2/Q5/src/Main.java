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
        System.out.print("Enter a positive integer number n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter " + n + " interger elements: ");
        inputArray(a);
        int sMax = findSMax(a);
        if (sMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest elements.");
        } else {
            System.out.println("The second largest element is: " + sMax);
        }
    }

    public static void inputArray(int[] a) {
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sn.nextInt();
        }
    }
}
