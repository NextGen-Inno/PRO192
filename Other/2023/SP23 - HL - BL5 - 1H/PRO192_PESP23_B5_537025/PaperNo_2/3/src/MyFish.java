
import java.util.ArrayList;
import java.util.List;

public class MyFish implements IFish {

    @Override
    public int f1(List<Fish> list) {
        int sum = 0;
        for (Fish fish : list) {
            if (fish.getName().startsWith("C") && fish.getName().endsWith("D")) {
                sum += fish.getWeight();
            }
        }
        return sum;
    }

    @Override
    public List<Fish> f2(List<Fish> list) {
        List<Fish> listMax = new ArrayList<>();
        double maxWeight = Double.MIN_VALUE;
        for (Fish f : list) {
            if (f.getWeight() > maxWeight) {
                maxWeight = f.getWeight();
                listMax.clear();
                listMax.add(f);
            } else if (f.getWeight() == maxWeight) {
                listMax.add(f);
            }
        }
        return listMax;
    }

    @Override
    public void f3(List<Fish> list) {
        double minWeight = Double.MAX_VALUE;
        for (Fish f : list) {
            if (f.getWeight() < minWeight) {
                minWeight = f.getWeight();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Fish get = list.get(i);
            if (get.getWeight() == minWeight) {
                list.remove(get);
            }
        }
    }

}
