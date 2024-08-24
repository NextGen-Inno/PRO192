
import java.util.ArrayList;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class SDrinkList extends ArrayList<SDrink> {

    public void addSDrink(SDrink sdrink) {
        this.add(sdrink);
    }

    public int getSDrinkByMake(String make) {
        int count = 0;
        for (SDrink sd : this) {
            if (sd.getMake().equalsIgnoreCase(make)) {
                count++;
            }
        }
        return count;
    }

    public SDrink getSDrinkWithMinPrice() {
        ArrayList<SDrink> temp = new ArrayList<>(this);
        temp.sort(new Comparator<SDrink>() {
            @Override
            public int compare(SDrink o1, SDrink o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }

        });
        return temp.get(0);
    }
}
