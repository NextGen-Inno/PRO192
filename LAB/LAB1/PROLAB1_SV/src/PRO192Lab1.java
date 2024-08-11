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
            System.out.println(n + "Even");
        } else {
            System.out.println(n + "Odd");
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

        System.out.println("Sum of odd natural numbers not greater than or equal to" + n + "\nS1 = " + s1);
        System.out.println("Sum of even natural numbers not greater than or equal to" + n + "\nS2 = " + s2);
        System.out.println("Sum of natural numbers not greater than " + n + ", divisible by 3\nS3 = " + s3);
        System.out.println("Sum of natural numbers not greater than " + n + ", not divisible by 3\nS4 =" + s4);
        System.out.println("Sum of natural numbers not greater than " + n + "\nS5 =" + s5);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void f4_CheckPrime(int n) {
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public void f5_ListPrimeToN(int n) {
        System.out.print("Prime numbers up to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void f6_ListTheFirstNPrimeNumbers(int n) {
        System.out.print("First " + n + " prime numbers: ");
        int count = 0, number = 2;
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
    }

    public void f7_ListFiboToN(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci numbers up to " + n + ": ");

        while (a <= n) {
            if (a > 0) {
                System.out.print(a + " ");
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public void f8_ListTheFirstNFibo(int n) {
        int a = 0, b = 1;
        System.out.print("First " + n + " Fibonacci numbers: ");

        for (int i = 0; i <= n; i++) {
            System.out.print((i == 0 ? 1 : a) + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static void f9_NumberToWord(int n) {
        String result;
        switch (n) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
                result = "The number is out of the range of 0 to 9.";
        }
        System.out.println(result);
    }

}
