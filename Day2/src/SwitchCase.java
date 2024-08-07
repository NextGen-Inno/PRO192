
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n;
        System.out.print("Nhap giai thuong cua ban: ");
        n=sn.nextInt();
        giaiThuong(n);
        System.out.println("");
    }
    
    public static void giaiThuong(int n) {
        switch (n){
            case 1:
                System.out.println("Giai nhat: 1000000");
                break;
            case 2:
                System.out.println("Giai nhi: 500000");
                break;
            case 3:
                System.out.println("Giai ba: 100000");
                break;
            case 4:
                System.out.println("Giai khuyen khich: 10000");
                break;
            default:
                System.out.println("Chuc ban may man lan sau");
        }
    }
    
}
