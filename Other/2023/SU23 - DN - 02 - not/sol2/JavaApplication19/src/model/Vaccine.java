package model;

import java.util.Date;

public class Vaccine {

    private String name;
    private String code;
    private int quantity;
    private Date expirationDate;
    private double price;
    private Date lastInjectedDate;

    // Constructors
    public Vaccine(String name, String code, int quantity, Date expirationDate, double price, Date lastInjectedDate) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.price = price;
        this.lastInjectedDate = lastInjectedDate;
    }

    public Vaccine() {
        // Default constructor
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getLastInjectedDate() {
        return lastInjectedDate;
    }

    public void setLastInjectedDate(Date lastInjectedDate) {
        this.lastInjectedDate = lastInjectedDate;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Vaccine{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", quantity=" + quantity +
                ", expirationDate=" + expirationDate +
                ", price=" + price +
                ", lastInjectedDate=" + lastInjectedDate +
                '}';
    }
    
    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vaccine vaccine = (Vaccine) o;
        return code.equals(vaccine.code);
    }

    // hashCode method
    @Override
    public int hashCode() {
        return code.hashCode();
    }

}
