/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SoidStateDrive extends Product {

    private String code;
    private int speed, quantity;
    private double price;

    public SoidStateDrive() {
    }

    public SoidStateDrive(String code, int speed, int quantity, double price, String name, String brand) {
        super(name, brand);
        this.code = code;
        this.speed = speed;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return code + ", " + super.getName() + ", " + super.getBrand() + ", " + String.format("%s, %.2f", speed, price);
    }

    @Override
    public double getFinalPrice() {
        if (speed <= 1024) {
            return price - price * 0.2;
        } else if (speed <= 2024) {
            return price - price * 0.1;
        }
        return price - price * 0.1;
    }

    @Override
    public double getTotalAmount() {
        return quantity * getFinalPrice();
    }

}
