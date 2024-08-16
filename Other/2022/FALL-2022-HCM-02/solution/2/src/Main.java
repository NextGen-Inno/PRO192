
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
        System.out.println("1. Test getPerimeter()");
        System.out.println("2. Test getArea()");
        System.out.println("3. Test output()");
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.print("Enter TC: ");
        int tc = sc.nextInt();
        double length, width;
        switch (tc) {
            case 1:
                System.out.print("Enter the length: ");
                length = sc.nextDouble();
                System.out.print("Enter the width: ");
                width = sc.nextDouble();
                r = new Rectangle(width, length);
                System.out.println("OUTPUT:");
                System.out.println(r.getPerimeter());
                break;
            case 2:
                System.out.print("Enter the length: ");
                length = sc.nextDouble();
                System.out.print("Enter the width: ");
                width = sc.nextDouble();
                r = new Rectangle(width, length);
                System.out.println("OUTPUT:");
                System.out.println(r.getArea());                
                break;
            case 3:
                System.out.print("Enter the length: ");
                length = sc.nextDouble();
                System.out.print("Enter the width: ");
                width = sc.nextDouble();
                r = new Rectangle(width, length);
                System.out.print("Enter the edge: ");
                double edge = sc.nextDouble();
                Square s = new Square(edge);
                r.output();
                s.output();
                break;
        }
    }
}
