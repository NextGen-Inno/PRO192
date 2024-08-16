/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Vaccine;
import view.Menu;
import view.Validation;

public class VaccineManager extends Menu {

    static String[] menu = {"Display all vaccines form file", "Add a vaccine", "Delete a vaccine by code", "Sort vaccine by name", "Save to file", "Exit"};
    Validation val = new Validation();
    private List<Vaccine> vaccines;

    public VaccineManager() {
        super("Vacine Management System", menu);
        vaccines = new ArrayList<>();
        loadVaccinesFromFile("vaccines_input.txt");
    }

    // Getter
    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    // Add a vaccine to the list
    public void addVaccine(Vaccine vaccine) {
        vaccines.add(vaccine);
    }

    // Remove a vaccine from the list
    public void removeVaccine(Vaccine vaccine) {
        vaccines.remove(vaccine);
    }

    // Get the count of vaccines in the list
    public int getVaccineCount() {
        return vaccines.size();
    }

    // Check if the list of vaccines is empty
    public boolean isEmpty() {
        return vaccines.isEmpty();
    }

    // Load vaccines from file and display them
    public void loadVaccinesFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] attributes = line.split(", ");

                Vaccine vaccine = new Vaccine();
                for (String attribute : attributes) {
                    String[] parts = attribute.split("=");
                    String attributeName = parts[0].trim();
                    String attributeValue = parts[1].trim();

                    switch (attributeName) {
                        case "code":
                            vaccine.setCode(attributeValue);
                            break;
                        case "name":
                            vaccine.setName(attributeValue);
                            break;
                        case "quantity":
                        try {
                            int quantity = Integer.parseInt(attributeValue);
                            vaccine.setQuantity(quantity);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid quantity value: " + attributeValue);
                        }
                        break;
                        case "expirationDate":
                        try {
                            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            vaccine.setExpirationDate(dateFormat.parse(attributeValue));
                        } catch (ParseException e) {
                            System.out.println("Invalid expiration date format: " + attributeValue);
                        }
                        break;
                        case "price":
                        try {
                            double price = Double.parseDouble(attributeValue);
                            vaccine.setPrice(price);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid price value: " + attributeValue);
                        }
                        break;
                        case "lastInjectedDate":
                        try {
                            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            vaccine.setLastInjectedDate(dateFormat.parse(attributeValue));
                        } catch (ParseException e) {
                            System.out.println("Invalid last injected date format: " + attributeValue);
                        }
                        break;
                        default:
                            System.out.println("Invalid attribute name: " + attributeName);
                            break;
                    }
                }

                addVaccine(vaccine);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }


    @Override
    public void execute(int choice) {

        switch (choice) {
            case 1:
                displayAll();

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
        }
    }

    private void displayAll() {
        System.out.println("List of Vaccine\n------------------------");
        for (Vaccine b : vaccines) {
            System.out.println(b);
        }
    }
    
    public static void main(String[] args) {
        VaccineManager mgnObj = new VaccineManager();
        mgnObj.run();
    }
}
