/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class MyBoat extends iBoat {

    private int price;

    // Constructor
    public MyBoat() {
    }

    public MyBoat(int price) {
        this.price = price;
    }

    public MyBoat(String name, String type, int price) {
        super(name, type);
        this.price = price;
    }

    public void fixName() {
        if (name != null && name.length() > 0) {
            this.name = name.substring(1);
        }
    }

    public int getPrice() {
        int digitCount = 0;
        for (char c : type.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        if (digitCount == 1) {
            return price * name.length();
        }
        
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + type + " " + price;
    }
}