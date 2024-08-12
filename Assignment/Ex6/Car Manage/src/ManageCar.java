/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;

/**
 *
 * @author DUKE
 */
public class ManageCar {
    public void checkCarName(Car x) {
        System.out.println("Ten xe in hoa: " + x.getCarName().toUpperCase());
    }

    public void checkCarType(Car x) {
        String carType = x.getCarType();
        char lastChar = carType.charAt(carType.length() - 1);
        if (Character.isDigit(lastChar)) {
            System.out.println("Xe Vip loai " + lastChar);
        } else {
            System.out.println("Xe binh dan");
        }
    }

    public void checkTax(Car x, double xPrice) {
        String carType = x.getCarType();
        char lastChar = carType.charAt(carType.length() - 1);
        double tax;
        
        if (lastChar == '5' && x.getCarPrice() > xPrice) {
            tax = (lastChar - '0') * x.getCarPrice() / 100;
        } else {
            tax = 0.1 * x.getCarPrice();
        }
        System.out.println("Thue: " + tax);
    }
}

