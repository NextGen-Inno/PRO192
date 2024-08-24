/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public abstract class Product {

    private String name, brand;

    public Product() {
    }

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public abstract double getFinalPrice();

    public abstract double getTotalAmount();

}
