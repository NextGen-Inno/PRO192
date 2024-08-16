package model;

import java.time.LocalDate;
import java.util.*;

public class Customer {
    private String id;
    private String name;
    private String phone;
    private Date dob;

    public Customer(String id, String name, String phone, Date dob)  {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", dob=" + dob + '}';
    }
//
//    @Override
//    public int compareTo(Customer o) {
//        return this.getId().compareTo(o.getId());
//    }
    
    
    
}
