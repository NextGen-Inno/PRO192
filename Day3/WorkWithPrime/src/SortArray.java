import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        int[] a={7,15,2,6,9,11,18,4,5,8};  
        displayArr(a);
        System.out.println("\nAfter sorting");
        sortArrAsc(a);
        displayArr(a);
        System.out.println("\nSort Desc");
        sortArrDesc(a);
        displayArr(a);
        System.out.println("");
    }
    public static void sortArrDesc(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length-1; j > i; j--) {
                if (a[j]>a[j-1]) {
                    int temp=a[j]; a[j]=a[j-1]; a[j-1]=temp;
                }
            }
        }
    }    
    public static void sortArrAsc(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length-1; j > i; j--) {
                if (a[j]<a[j-1]) {
                    int temp=a[j]; a[j]=a[j-1]; a[j-1]=temp;
                }
            }
        }
    }
    
    public static void displayArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }   
    
}
