/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int discount;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = 0;
    }
    
    
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    public double subTotal() {
        double subTotal = quantity * price * (100 - discount) / 100;
        return subTotal;
    }
    
}
