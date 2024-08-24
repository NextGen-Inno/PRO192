
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Pet implements ITax {
    private String name;
    private String birthday;
    private ArrayList<Service> usedServices;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        usedServices = new ArrayList<>();
    }
    
    public void addService(String nameService, int price) {
        usedServices.add(new Service(nameService, price));
    }

    @Override
    public String toString() {
        return name + "-" + getTotalMoney() + "-" + getTax();
    }

    @Override
    public double getTax() {
        return VAT * getTotalMoney();
    }

    @Override
    public double getTotalMoney() {
        double res = 0;
        for (Service s : usedServices) res += s.getPrice();
        int m = Integer.parseInt(birthday.split("/")[0]);
        if (10 <= m && m <= 12)
            return res * 0.95;
        return res;
    }       
    
}
