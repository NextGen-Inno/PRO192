
import java.util.Scanner;

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
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter a positive integer number n: ");
        int n = sn.nextInt();
        System.out.print("The first " + n + " prime numbers are: ");
        
        listFirstNPrimes(n);
    }

    public static void listFirstNPrimes(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (PrimeLib.isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println("");
    }

    public static class PrimeLib {
        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}


