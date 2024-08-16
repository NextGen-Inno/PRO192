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
import java.util.Date;
import java.util.Iterator;
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

    public void inputVaccine() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vaccine information:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Code: ");
        String code = scanner.nextLine();

        int quantity = 0;
        while (quantity <= 0) {
            System.out.print("Quantity: ");
            try {
                quantity = scanner.nextInt();
                if (quantity <= 0) {
                    System.out.println("Error: Quantity must be a positive integer. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid quantity. Please enter a valid positive integer.");
                scanner.nextLine(); // Consume invalid input
            }
        }

        double price = 0.0;
        while (price <= 0.0) {
            System.out.print("Price: ");
            try {
                price = scanner.nextDouble();
                if (price <= 0.0) {
                    System.out.println("Error: Price must be a positive number. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid price. Please enter a valid positive number.");
                scanner.nextLine(); // Consume invalid input
            }
        }

        Date expirationDate = null;
        while (expirationDate == null) {
            System.out.print("Expiration Date (dd/MM/yyyy): ");
            String expirationDateStr = scanner.next();
            expirationDate = parseDate(expirationDateStr);
            if (expirationDate == null) {
                System.out.println("Error: Invalid date format. Please enter the date in the correct format (dd/MM/yyyy).");
            }
        }

        Date lastInjectedDate = null;
        while (lastInjectedDate == null) {
            System.out.print("Last Injected Date (dd/MM/yyyy): ");
            String lastInjectedDateStr = scanner.next();
            lastInjectedDate = parseDate(lastInjectedDateStr);
            if (lastInjectedDate == null) {
                System.out.println("Error: Invalid date format. Please enter the date in the correct format (dd/MM/yyyy).");
            }
        }

        Vaccine vaccine = new Vaccine(name, code, quantity, expirationDate, price, lastInjectedDate);
        addVaccine(vaccine);

        System.out.println("The vaccine has been added to the list.");
    }

    private Date parseDate(String dateString) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            return null;
        }
    }

    // Getter
    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    // Add a vaccine to the list
    public void addVaccine(Vaccine vaccine) {
        boolean vaccineExists = false;
        for (Vaccine existingVaccine : vaccines) {
            if (existingVaccine.getCode().equals(vaccine.getCode())) {
                vaccineExists = true;
                break;
            }
        }
        if (!vaccineExists) {
            vaccines.add(vaccine);
            System.out.println("Vaccine added to the list.");
        } else {
            System.out.println("Error: Vaccine with the same code already exists. New vaccine not added.");
        }
    }

    // Delete a vaccine from the list based on the vaccine code
    public void deleteVaccine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Code: ");
        String code = scanner.nextLine();
        Iterator<Vaccine> iterator = vaccines.iterator();
        while (iterator.hasNext()) {
            Vaccine vaccine = iterator.next();
            if (vaccine.getCode().equals(code)) {
                iterator.remove();
                System.out.println("Vaccine with code " + code + " has been deleted.");
                return; // Exit the method after deleting the vaccine
            }
        }
        System.out.println("Error: Vaccine with code " + code + " not found.");
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
                inputVaccine();
                break;
            case 3:
                deleteVaccine();
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
