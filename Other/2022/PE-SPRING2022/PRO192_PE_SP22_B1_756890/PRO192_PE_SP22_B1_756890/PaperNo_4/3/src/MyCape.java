
import java.util.List;


/**
 *
 * @author admin
 */
public class MyCape implements ICape{

    @Override
    public int f1(List<Cape> t) {
        double average= 0;
        double total  = 0;
        for (Cape cape : t) {
             total += cape.getColor();
        }
        average = total / t.size();
        int count = 0;
        for (Cape cape : t) {
            if (cape.getColor() > average) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cape> t) {
        double average= 0;
        double total  = 0;
        for (Cape cape : t) {
             total += cape.getColor();
        }
        average = total / t.size();
        for (Cape cape : t) {
            if (cape.getColor() > average) {
                t.remove(cape);
                return;
            }
        }
    }

    @Override
    public void f3(List<Cape> t) {
        for (int i = 0; i < t.size(); i++) {
            for (int j = 0; j < t.size() - 1 - i; j++) {
                
                }
            }
        }
 
    
    
}
