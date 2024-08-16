
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class ItemList extends ArrayList<Item>{
    
    public void addItem(Item item) {
        this.add(item);
    }
    
    public void printFirstItem() {
        //lay ra phan tu o vi tri so 0 ( vi tri dau tien)
        Item item = this.get(0);
        //hien thi ra 
        System.out.println(item);
    }
    
    public int getTotalQuantity() {
        int quantityTotal = 0;
        for (Item item : this) {
            quantityTotal += item.getQuantity();
        }
        return quantityTotal;
    }
}
