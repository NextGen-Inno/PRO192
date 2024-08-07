
import java.util.Scanner;

public class DayOfMonth {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n;
        System.out.print("Nhap thang: ");
        n = sn.nextInt();
        dayOfMonth(n);
        System.out.println("");
    }

    public static void dayOfMonth(int m) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + m + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + m + " co 30 ngay");
                break;                
            case 2:    
                System.out.println("Thang " + m + " co 28 hoac 29 ngay");
                break;  
            default:    
                System.out.println("Day khong phai thang trong nam.");
        }
    }
}
