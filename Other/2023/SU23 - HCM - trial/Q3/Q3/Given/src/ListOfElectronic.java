
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class ListOfElectronic extends HashMap<String, Electronic>{
    
    public List<Electronic> toList() {
        return new ArrayList<>(this.values());
    }
    
    public void addElement(Electronic e) {
        this.put(e.getCode(), e);
    }
    
    public int countByBrand(String prefix) {
        int count = 0;
        
        for (Electronic value : this.values()) {
            if (value.getBrand().toUpperCase().startsWith(prefix.toUpperCase()) ) {
                count++;
            }
        }
        return count;
    }
    
    public List<Electronic> filterByPrice(long min, long max) {
        List<Electronic> list = new ArrayList<>();
        for (Electronic value : this.values()) {
            if (value.getPrice() >= min && value.getPrice() <= max) {
                list.add(value);
            }
        }
        return list;
    }
}
