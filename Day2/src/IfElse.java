
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int n;
        double GPA;
        Scanner sn = new Scanner(System.in);
        
//        System.out.print("Input n = ");
//        n=sn.nextInt();
//        oddEven(n);     //Goi ham  
        System.out.print("Input your GPA = ");
        GPA = sn.nextDouble();
        grading(GPA);
    }
    
    public static void oddEven(int n){
        if (n%2==0) {
            System.out.println("Even number");
        } else{
            System.out.println("Odd number");
        }            
    }   
    
    public static void grading(double x) {
        if (x>=9) {
            System.out.println("Excellence");
        } else if (x>=8) {
            System.out.println("Good");
        } else if (x>=7) {
            System.out.println("Well");
        } else if (x>=5) {
            System.out.println("Fair");
        } else {
            System.out.println("Poor");
        }
    }
}
