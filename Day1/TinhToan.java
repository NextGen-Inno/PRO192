
import java.text.DecimalFormat;


public class TinhToan {
    public static void main(String[] args) {
        int a,b;
        a=5;
        b=7;
        int tong=a+b;
        int hieu=a-b;
        int tich=a*b;
        double thuong=(double)a/b;
        
        System.out.println("Tong: "+a+"+"+b+" = "+tong);
        System.out.println("Hieu: "+a+"-"+b+" = "+hieu);
        System.out.println("Tich: "+a+"*"+b+" = "+tich);
        System.out.println("Thuong: "+a+"/"+b+" = "+thuong);
        System.out.printf("Thuong: %d/%d=%.2f",a,b,thuong);
        
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("\nThuong 2 = "+ df.format(thuong));
        
        char c1,c2,c3;
        c1='F';
        c2='P';
        c3='T';
        System.out.println(c1+c2+c3);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.println("");
        String s = "SV FPT Hanoi";      //Khai bao 1 xau ky tu
        System.out.println(s);
        
        char c;
        c=s.charAt(1);
        System.out.println(c);
        //Ky tu cuoi cung
        int lastIndex = s.length();
        System.out.println(s.charAt(lastIndex-1));
        System.out.println("");
        
        //Trich subString
        String s1;
        s1=s.substring(4);
        System.out.println("Xau con s1: "+ s1);
        
        //Trich subString from m to n
        String s2 = s.substring(0, 6);
        System.out.println("Xau con s2: "+ s2);
        System.out.println("");
        //Trich subString from m to n
        String s3 = s.substring(lastIndex-5);
        System.out.println("Xau con s3: "+ s3);        
        
    }
}
