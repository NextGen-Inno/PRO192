
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        MyPick myM = new MyPick();
        System.out.print("Input Name: ");
        myM.setName(sn.nextLine());
        System.out.print("Input Weight: ");
        myM.setWeight(Integer.parseInt(sn.nextLine()));
        try {
            int n;

                myM.Menu();
                n = Integer.parseInt(sn.nextLine());
                switch (n) {
                    case 1: System.out.println(myM.getName()); break;
                    case 2: System.out.print(myM.getWeight()); break;
                    default: System.out.println("Select again!");
                }

        } catch (Exception e) {
            System.out.println(e);
        }        
        System.out.println("");
        
    }
}
