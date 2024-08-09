
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);


        System.out.print("Enter a positive integer number m for the first m prime numbers: ");
        int n = sn.nextInt();
        System.out.print("The first " + n + " prime numbers are: ");
        listFirstNPrimes(n);
    }

    public static void listFirstNPrimes(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println("");
    }

    private static boolean isPrime(int num) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


