/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class PC {

    private String model;
    private double price;
    private double rate;

    public PC() {
    }

    public PC(String model) {
        this.model = model;

    }

    public PC(String model, double rate, double price) {
        this.model = model;
        this.rate = rate;
        this.price = price;

    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public double getRate() {
        return rate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
