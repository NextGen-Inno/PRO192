package Car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        // Khoi tao doi tuong Car voi cac thuoc tinh
        System.out.print("Nhap ten xe: ");
        String carName = sn.nextLine();

        System.out.print("Nhap loai xe: ");
        String carType = sn.nextLine();

        System.out.print("Nhap gia xe: ");
        double carPrice = sn.nextDouble();

        Car car = new Car(carName, carType, carPrice);
        ManageCar myCar = new ManageCar();
        int choice = 0;

        do {
            menu();
            choice = sn.nextInt();
            sn.nextLine(); // Doc dong moi sau khi nhap so

            switch (choice) {
                case 1:
                    // In hoa ten cua xe
                    myCar.checkCarName(car);
                    break;

                case 2:
                    // Kiem tra loai xe
                    myCar.checkCarType(car);
                    break;

                case 3:
                    // Kiem tra thue
                    System.out.print("Nhap muc gia de kiem tra thue (xPrice): ");
                    double xPrice = sn.nextDouble();
                    myCar.checkTax(car, xPrice);
                    break;

                case 4:
                    // Thoat chuong trinh
                    System.out.println("Thoat chuong trinh.");
                    sn.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 4);
    }

    public static void menu() {
        System.out.println("\nChon chuc nang:");
        System.out.println("1. In hoa ten cua xe");
        System.out.println("2. Kiem tra loai xe");
        System.out.println("3. Kiem tra thue");
        System.out.println("4. Thoat chuong trinh");
        System.out.print("Chon chuc nang: ");
    }
}
