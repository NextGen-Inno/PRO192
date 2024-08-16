
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ItemList extends ArrayList<Item> {
    public void addItem(Item item) {
        this.add(item);
    }
    
    public void printFirstItem() {
        System.out.println(this.get(0));
    }
    
    public int getTotalQuantity() {
        int s = 0;
        for (Item i : this) s += i.getQuantity();
        return s;
    }
}
