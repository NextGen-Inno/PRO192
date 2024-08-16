/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Carp {
    private String pond;
    private int size;

    public Carp() {
    }

    public Carp(String pond, int size) {
        this.pond = pond;
        this.size = size;
    }
    
    public String getPond() {
        return pond.substring(0, 2).toLowerCase() + pond.substring(2);
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
}
