import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = sn.nextInt();
        
        PrimeLib myPrime = new PrimeLib();
        if (myPrime.isPrime(n)) {
            System.out.println(n+ " is a prime number");
        } else
            System.out.println(n+" is not a prime number");
        System.out.println("");
    }
}
