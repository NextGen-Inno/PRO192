/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;

/**
 *
 * @author DUKE
 */
public class Car {
    private String carName;
    private String carType;

    public Car(String carName, String carType, double carPrice) {
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
    }
    
    private double carPrice;

    public String getCarName() {
        return carName;
    }

    public String getCarType() {
        return carType;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }
    
    
}
