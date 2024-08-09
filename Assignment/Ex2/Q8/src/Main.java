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

        Syspublic class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
                System.out.print("Enter a positive integer number n: ");
                int n = sc.nextInt();
                sc.nextLine(); 
        
                String[] a = new String[n];
        
                System.out.println("Enter " + n + " string elements:");
                inputArray(a);
        
                System.out.print("Enter a positive integer number k: ");
                int k = sc.nextInt();
        
                System.out.println("Strings with lengths greater than or equal to " + k + ":");
                displayArr(a, k); 
        
            public static void inputArray(String[] a) {
                Scanner sn = new Scanner(System.in);
                for (int i = 0; i < a.length; i++) {
                    a[i] = sn.nextLine();
                }
            }
        
            public static void displayArr(String[] a, int k) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i].length() >= k) {
                        System.out.println(a[i]);
                    }
                }                
            }
        }

