
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyBoat myB = new MyBoat();
        Scanner sn = new Scanner(System.in);
        try {
            System.out.print("Input boat's name: ");
            myB.setName(sn.nextLine());
            System.out.print("Input boat's type: ");
            myB.setType(sn.nextLine());
            System.out.print("Input boat's price: ");
            myB.setPrice(Integer.parseInt(sn.nextLine()));
            Menu();
            int n = Integer.parseInt(sn.nextLine());
            switch (n) {
                case 1:
                    myB.fixName();
                    System.out.println(myB.toString());
                    break;
                case 2:
                    myB.getPrice();
                    System.out.println(myB.toString());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Select again.");
            }
        } catch (Exception e) {
            System.out.println("");
        }
        System.out.println("");
    }

    public static void Menu() {
        System.out.println("---o0o---");
        System.out.println("1. Test case 1");
        System.out.println("2. Test case 2");
        System.out.println("3. Quit");
        System.out.print("What is your choise: ");
    }
}
