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
        inputArray(a);
        int sMin = findSMin(a);
        if (sMin == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("The second smallest element is: " + sMin);
        }
    }

    public static void inputArray(int[] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static int findSMin(int[] a) {
        int min = a[0];
        int sMin = Integer.MAX_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                sMin = min;
                min = a[i];
            } else if (a[i] < sMin && a[i] > min) {
                sMin = a[i];
            }
        }

        return sMin;
    }
}