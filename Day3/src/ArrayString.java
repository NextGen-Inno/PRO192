
import java.util.Arrays;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        String[] S={"Nam","Huy","Binh","Mai","Linh","Huong","Tuan","Ngoc","Nga","Kien"};
        int n=10;
        displayArr(S);
        System.out.println("");
        
        Scanner sn = new Scanner(System.in);
        System.out.print("Input searching keyword: ");
        String kw = sn.nextLine();
        findName(S, kw);
        System.out.println("-----After sorting------");
        sortString(S);
        displayArr(S);
        System.out.println("\n-----Sort bubble-----");
        sortStringBubble(S);
        displayArr(S);
        System.out.println("");
    }
    
    public static void sortString(String[] S) {
        Arrays.sort(S);//ASC
    }

    public static void sortStringBubble(String[] S) {
        for (int i = 0; i < S.length; i++) {
            for (int j = S.length-1; j > i; j--) {
                if (S[j].compareToIgnoreCase(S[j-1])>0) {
                    String temp=S[j]; S[j]=S[j-1]; S[j-1]=temp;
                }
            }
        }
    }
    
    public static void findName(String[] S, String kw) {
        boolean ok=false;
        for (int i = 0; i < S.length; i++) {
            if (S[i].equalsIgnoreCase(kw)) {
                System.out.println("Found "+kw.toUpperCase()+" at position "+(i+1));
                ok=true;
                break;
            }            
        }
        if (!ok) System.out.println("Find not found "+kw.toUpperCase());        
    }
    
    public static void displayArr(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }     
    
}
