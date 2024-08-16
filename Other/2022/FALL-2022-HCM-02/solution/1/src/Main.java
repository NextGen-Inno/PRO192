
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Test getImportTax()");
        System.out.println("2. Test total()");
        System.out.println("3. Test getName()");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter TC (1,2 or 3):");
        int tc = sc.nextInt();
        Product p = new Product();
        double price;
        switch (tc) {
            case 1:
                System.out.print("Enter the price of product:");
                price = sc.nextDouble();
                p.setPrice(price);
                System.out.println("OUTPUT:");
                System.out.println(p.getImportTax());
                break;
            case 2:
                System.out.print("Enter the price of product:");
                price = sc.nextDouble();
                p.setPrice(price);
                System.out.print("Enter the quantity of product:");
                int quantity = sc.nextInt();
                p.setQuantity(quantity);
                System.out.println("OUTPUT:");
                System.out.println(p.total());
                break;
            case 3:
                sc = new Scanner(System.in);
                System.out.print("Enter the name of product:");
                String name = sc.nextLine();
                p.setName(name);
                System.out.println("OUTPUT:");
                System.out.println(p.getName());
                break;
        }
    }
}
