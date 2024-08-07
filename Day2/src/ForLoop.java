
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap n= ");
        int n = sn.nextInt();  
        chepPhat(n);        
        System.out.println("");
        System.out.println("Total from 0 to "+n+": "+sumToN(n));
        sumWithN(n);
        System.out.println("");
        cuuChuong(n);
        System.out.println("");
        cuuChuong2();
        System.out.println("");
    }
    public static void chepPhat(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i+". Anh yeu em!");
        }
    }  
    public static int sumToN(int n) {
        int S=0;
        for (int i = 0; i <= n; i++) {
            S+=i;   //S = S + i;
        }
        return S;
    }
    
    public static void sumWithN(int n) {
        int S=0,S1=0,S2=0;
        for (int i = 0; i <= n; i++) {
            S+=i;
            if (i%2==0) S2+=i;
            else S1+=i;
        }
        System.out.println("Total from 0 to "+n+": "+S);
        System.out.println("Total of odd number from 0 to "+n+": "+S1);
        System.out.println("Total of even number from 0 to "+n+": "+S2);
    }
    
    public static void cuuChuong(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(n+" x "+ i + " = "+i*n);
        }
    }
    
    public static void cuuChuong2() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j+" x "+ i + " = "+i*j+"\t");
            }
            System.out.println("");
        }
    }    
}
