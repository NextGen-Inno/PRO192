
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MotoList extends HashMap<String, Motorbike> {

    public List<Motorbike> toList() {
        return new ArrayList<>(values());
    }

    public void addElement(Motorbike m) {
        put(m.getLicencePlate(), m);
    }

    public void listByDistrict(String distCode) {
        for (Motorbike motorbike : values()) {
            String a = motorbike.getLicencePlate();
            String b = String.valueOf(a.charAt(2));
            if (b.equals(distCode)) {
                String owner = motorbike.getOwner();
                long value = motorbike.getValue();
                System.out.printf("%s - %s - %s\n", a, owner, value);
            }
        }
    }

    public long totalValue() {
        long total = 0;
        for (Motorbike motorbike : values()) {
            total += motorbike.getValue();
        }
        return total;
    }

    public void showAll() {
        for (Motorbike motorbike : values()) {
            String a = motorbike.getLicencePlate();
            String b = motorbike.getOwner();
            long c = motorbike.getValue();
            System.out.printf("%s %s - %s\n", a, b, c);
        }
    }
}
