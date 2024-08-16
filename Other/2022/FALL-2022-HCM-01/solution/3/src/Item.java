/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Item {
    private String name;
    private int quantity;

    public Item() {
    }

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name.toUpperCase();
    }
    
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + "," + quantity;
    }
        
}
