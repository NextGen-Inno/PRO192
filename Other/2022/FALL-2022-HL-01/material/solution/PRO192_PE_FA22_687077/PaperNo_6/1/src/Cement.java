/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tien Dung
 */
public class Cement {
    private String label;
    private int type;

    public Cement() {
    }

    public Cement(String label, int type) {
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        String result = label.substring(0, 3).toLowerCase() + label.substring(3);
        return result;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    
    
}
