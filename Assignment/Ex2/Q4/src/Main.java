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
        System.out.print("Enter " + n + " integer elements: ");
        inputArray(a, sc);
        int sMax = findSMax(a);
        if (sMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + sMax);
        }
    }

    public static void inputArray(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static int findSMax(int[] a) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                sMax = max;
                max = a[i];
            } else if (a[i] > sMax && a[i] < max) {
                sMax = a[i];
            }
        }

        return sMax;
    }
}
