
import java.util.Scanner;


public class ArrayType {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        int n = sn.nextInt();
        int[] a={7,15,2,6,9,11,18,4,5,8};
//        a = new int[n];
//        inputArray(a);
        System.out.println("Inputed array:");
        displayArr(a);
        System.out.println("");
        displayArrRev(a);
        System.out.println("");
        displayArr3(a);
        System.out.println("");
        System.out.println("The maximum value: "+findMax(a));
        System.out.println("The minimum value: "+findMin(a));
        System.out.println("\n------\n");
        findMaxMin(a);
        System.out.println("");
    }
    public static void inputArray(int[] a) {
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i]=sn.nextInt();
        }
    }   
    public static void displayArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void displayArrRev(int[] a) {
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]+" ");
        }
    }  
    
    public static void displayArr3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==1) {
                System.out.print(a[i]+" ");
            }            
        }
        System.out.println("");
        for (int i = a.length-1; i >=0 ; i--) {
            if (a[i]%2==0) {
                System.out.print(a[i]+" ");
            }            
        }       
    }       
    public static void findMaxMin(int[] a) {
        int Max=a[0],Min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>Max) Max=a[i];
            if (a[i]<Min) Min=a[i]; 
        }
        System.out.println("The maximum value:" + Max);
        System.out.println("The minimum value:" + Min);
    }      
    public static int findMax(int[] a) {
        int Max=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>Max) Max=a[i];
        }
        return Max;
    }     
    public static int findMin(int[] a) {
        int Min=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]<Min) Min=a[i];
        }
        return Min;
    }      
}
