/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.Company;
import model.Customer;

/**
 *
 * @author Trinh
 */
public class Validate extends Company {

    public Scanner sc = new Scanner(System.in);
    public Company com = new Company();

    public String inputString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public String checkID(String id) {
        String regex = "KH\\d{2}";
        if (id.isEmpty()) {
            return null;
        }
        if (id.matches(regex)) {
            return id;
        }
        return null;
    }

    public String checkIDExisted(String id) {
        for (Customer c : list) {
            if (c.getId().equals(id)) {
                return null;
            }
        }
        return id;
    }

    public String checkName(String name) {
        String regex = "^[a-zA-Z ]+$";
        if (name.isEmpty()) {
            return null;
        }
        if (name.matches(regex)) {
            return name;
        }
        return null;
    }

    public String checkPhoneNumber(String phonenum_raw) {
        String regex = "^09\\d{8}$";
        if (phonenum_raw.isEmpty()) {
            return null;
        }
        if (phonenum_raw.matches(regex)) {
            return phonenum_raw;
        }
        return null;
    }

    public Date checkDOB(String dob) {
        if (dob.isEmpty()) {
            return null;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(dob);
        } catch (ParseException e) {
            return null;
        }
    }

    public int checkInt(String input) {
        if (input.isEmpty()) {
            return -1;
        }
        try {
            int num = Integer.parseInt(input);
            return num;
        } catch (NumberFormatException e) {
        }
        return -1;
    }

}
