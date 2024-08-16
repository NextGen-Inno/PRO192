/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */

import java.util.stream.Collectors;

public class MyBoat extends Boat {
    private String model;

    public MyBoat(String name, String color, double price, String model) {
        super(name, color, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void MyInfor() {
        System.out.println("He180274 - NGUYEN MINH DUC");
    }
    
    public double getSalePrice() {
        if (model.length() > 0 && Character.toUpperCase(model.charAt(model.length() - 1)) == 'A') {
            return getPrice() * 0.95;
        }
        return getPrice();
    }

    @Override
    public String toString() {
        return "MyBoat name= " + getName() + ", color= " + getColor() + ", price= " + getPrice() + ", model= " + getModel();
    } 

    public int getGeneration() {
        if (model.length() >= 8) {
            String year = model.substring(1, 3);
            return 2000 + Integer.parseInt(year);
        }
        return 0;
    }

    public String getVersion() {
        if (model.length() >= 6) {
            String versionP = model.substring(5, 6);
            return "V" + versionP;
        }
        return " "; 
    }

    public void getCharModel() {
        String letters = model.replaceAll("[^A-Z]", "");
        String sortedLetters = letters.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(sortedLetters);
    }

    public void getDigitsModel() {
        String digits = model.replaceAll("[^0-9]", "");
        String sortedDigits = digits.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(sortedDigits);
    }
    
}


