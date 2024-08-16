/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.*;
import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import controller.CompanyManagement;
import java.time.LocalDate;

public class Company {

    private Scanner sc = new Scanner(System.in);
    public static ArrayList<Customer> list = new ArrayList<>();
    public static CompanyManagement com = new CompanyManagement();
    public static Validate val = new Validate();

//------------------------------------------------------------    
    public void displayList() {
        if (list.isEmpty()) {
            System.out.println("Sorry, the list is empty");
        }
        int count = 0;
        for (Customer customer : list) {
            count++;
            System.out.println(customer.toString());
        }
        System.out.println("---");
        System.out.println("Total staff: " + count);
        System.out.println("");
    }
//------------------------------------------------------------

    public ArrayList<Customer> search(Predicate<Customer> c) {
        ArrayList<Customer> rs = new ArrayList<>();
        for (Customer customer : list) {
            if (c.test(customer)) {
                rs.add(customer);
            }
        }
        return rs;
    }
//------------------------------------------------------------

    public void addCustomer(Customer e) {
        list.add(e);
        System.out.println("Add successfully");
    }
//------------------------------------------------------------
//------------------------------------------------------------

    public void writeFile(ArrayList<Customer> list, String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
            for (Customer customer : list) {
                String line = customer.getId() + ", " + customer.getName() + " " + customer.getPhone() + " " + customer.getDob();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            System.out.println("Write successfully");
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//------------------------------------------------------------

    public static void readFile(String path) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            String line = br.readLine();
            while (line != null) {
                String[] sub = line.split(",");
                if (sub.length == 4) {

                    String id = val.checkID(sub[0]);
                    String idCheck = val.checkIDExisted(id);
                    String name = val.checkName(sub[1]);
                    String phone = val.checkPhoneNumber(sub[2]);
                    Date dob = val.checkDOB(sub[3]);
                    if(idCheck != null){
                        if (id != null && name != null && phone != null && dob != null) {
                        Customer c = new Customer(idCheck, name, phone, dob);
                        list.add(c);
                        }         
                    } 
                }
                line = br.readLine();
            }
            System.out.println("Read successfully");
        } catch (Exception e) {
            System.out.println("Failed to read");
            e.printStackTrace();
        }
    }
//------------------------------------------------------------

    public void delete(String Id) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(Id)) {
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println(Id + " cannot be found");
            System.out.println("");
        } else if (count != 0) {
            String choose = val.inputString("Do you want to delete? (Y/N)");
            if (choose.equalsIgnoreCase("Y") || choose.equalsIgnoreCase("yes")) {
                System.out.println("Deleted from the list");
                System.out.println("");
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId().equalsIgnoreCase(Id)) {
                        list.remove(i);
                    }
                }

            } else {
                System.out.println("Cancelled");
                System.out.println("");
            }
        }

    }

}
