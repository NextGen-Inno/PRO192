/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author DUKE
 */
public class PRO192Lab1 {

    public void f0_MyInfor() {
    }

    public void f1_CheckOddEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n+"Even");
        } else {
            System.out.println(n+"Odd");
        }

    }

    public void f2_Lab1Math(int a, int b) {
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + difference);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + quotient);
    }

    public void f3_SumOfN(int n) {
        int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                s1 += i;
            }
            if (i % 2 == 0) {
                s2 += i; 
            }
            if (i % 3 == 0) {
                s3 += i; 
            } else {
                s4 += i; 
            }
            s5 += i; 
        }

        System.out.println("S1 (Sum of odd numbers): " + s1);
        System.out.println("S2 (Sum of even numbers): " + s2);
        System.out.println("S3 (Sum of numbers divisible by 3): " + s3);
        System.out.println("S4 (Sum of numbers not divisible by 3): " + s4);
        System.out.println("S5 (Sum of all numbers): " + s5);
    }

    public static int isPrime(int n) {

    }

    public void f4_CheckPrime(int n) {

    }

    public void f5_ListPrimeToN(int n) {

    }

    public void f6_ListTheFirstNPrimeNumbers(int n) {

    }

    public void f7_ListFiboToN(int n) {

    }

}
