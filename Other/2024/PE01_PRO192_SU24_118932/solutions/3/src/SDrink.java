/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SDrink {

    private String code, make;
    private double price;

    public SDrink() {
    }

    public SDrink(String code, String make, double price) {
        this.code = code;
        this.make = make;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2f", code, make.toUpperCase(), price);
    }
}
