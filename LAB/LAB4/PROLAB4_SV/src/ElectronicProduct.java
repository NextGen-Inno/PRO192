/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String name, double price, String brand, int warrantyMonths) {
        super(name, price, brand);
        this.warrantyMonths = warrantyMonths;
    }
    
    public double f4_calculateTax() {
        if (getPrice() <= 100) {
            return 0;
        } else if (getPrice() <= 500) {
            return getPrice() * 0.1;
        } else {
            return getPrice() * 0.3;
        }
    }
    
    public double f5_calculateDiscountPrice(String str) {
        String brand = getBrand();
        if (brand.endsWith(str)) {
            return getPrice() * 0.9;  // 10% discount
        }
        return getPrice();
    }
    
    public String f6_checkSpecialFeatures(String str) {
        if (getBrand().contains(str)) {
            return "Has special features";
        }
        return "No special features";
    }
    
    public String f7_checkWarrantyStatus() {
        if (warrantyMonths > 0) {
            return "Warranty valid";
        }
        return "Warranty expired";
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
    
}
