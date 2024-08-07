
import java.util.Scanner;

public class WhileDoWhile {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap n= ");
        int n = sn.nextInt();   
        System.out.println("Total from 0 to "+n+": "+ sumN(n));
        System.out.println("");
        System.out.println("Total from 0 to "+n+": "+ sumNDoWhile(n));
        System.out.println("");
    }    
    public static int sumN(int n) {
        int S=0;
        int i=0;
        while (i<=n){
            S+=i;   i++;
        }
        return S;
    }    
    public static int sumNDoWhile(int n) {
        int S=0, i=0;
        do{
            S+=i;   i++;
        }while (i<=n);
        return S;
    }    
}
