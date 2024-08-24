
import java.util.ArrayList;

public class Pet {
    private String name;
    private String birthday;
    private ArrayList<Service> usedServices = new ArrayList<>();

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public void addService(String nameService, int price) {
        Service service = new Service(nameService, price);
        usedServices.add(service);
    }

    @Override
    public String toString() {
        double totalMoney = 0;
        for (Service service : usedServices) {
            totalMoney += service.getPrice();
        }
        double tax = totalMoney * ITax.VAT;
        double totalPrice = totalMoney + tax;
        return name + "-" + totalPrice + "-" + tax;
    }
}