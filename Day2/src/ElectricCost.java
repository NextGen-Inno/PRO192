
import java.text.DecimalFormat;
import java.util.Scanner;


public class ElectricCost {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int numberOfElectric;
        System.out.print("Input number of electric: ");
        numberOfElectric=sn.nextInt();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("Total cost: %.2f", calculateElectricCost(numberOfElectric));
//        System.out.println("Total cost: "+ df.format(calculateElectricCost(numberOfElectric)));
        System.out.println("");
    }
    
    public static double calculateElectricCost(int n) {
        int m1 = 50*1500;
        int m2 = m1 + 50*1800;
        int m3 = m2 + 50*2400;
        int m4 = m3 + 50*3000;
        double kq;
        if (n<=50) {
            kq=n*1500;
        } else if (n<=100) {
            kq=m1+(n-50)*1800;
        } else if (n<=150) {
            kq=m2+(n-100)*2400;
        } else if (n<=200) {
            kq=m3+(n-150)*3000;
        } else
            kq=m4+(n-200)*3500;
        
        return kq*1.1;
    }    
}
