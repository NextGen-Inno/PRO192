import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        MyVnProduct myPrd = new MyVnProduct();
        List<Product> productList = loadProductsFromFile("ProductList.txt");

        while (true) {                
            Menu();
            int choice = sn.nextInt();
            sn.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("So luong san pham co gia lon hon 100,000 VND: " + myPrd.f1(productList));
                    break;
                case 2:
                    System.out.println("Tong gia tri cua tat ca cac san pham: " + myPrd.f2(productList));
                    break;
                case 3:
                    System.out.println("Cac san pham co gia nho hon 50,000 VND:");
                    myPrd.f3(productList);
                    break;
                case 4:
                    System.out.println("Sap xep va hien thi cac san pham tu thu 2 den thu 5:");
                    myPrd.f4(productList);
                    break;
                case 5:
                    System.out.println("Danh sach cac san pham ma ten san pham ket thuc bang ky tu 'a' va sap xep theo gia giam dan:");
                    myPrd.f5(productList);
                    break;
                case 6:
                    System.out.print("Nhap ten san pham: ");
                    String name = sn.nextLine();
                    System.out.print("Nhap gia san pham: ");
                    double price = sn.nextDouble();
                    Product newProduct = new Product(name, price);
                    myPrd.addProduct(productList, newProduct);
                    System.out.println("Da them san pham moi.");
                    break;
                case 7:
                    System.out.println("Thoat chuong trinh.");
                    sn.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        }
    }

    public static List<Product> loadProductsFromFile(String filename) {
        List<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    products.add(new Product(name, price));
                }
            }
        } catch (IOException e) {
            System.err.println("Loi khi doc file: " + e.getMessage());
        }
        return products;
    }
    
    public static void Menu() {
            System.out.println("\n---------o0o---------");
            System.out.println("1. Dem so luong san pham co gia lon hon 100,000 VND");
            System.out.println("2. Tinh tong gia tri cua tat ca cac san pham");
            System.out.println("3. Hien thi cac san pham co gia nho hon 50,000 VND");
            System.out.println("4. Sap xep va hien thi cac san pham tu thu 2 den thu 5 theo ten tang dan");
            System.out.println("5. Liet ke danh sach cac san pham co ten ket thuc bang 'a' va sap xep theo gia giam dan");
            System.out.println("6. Them san pham moi");
            System.out.println("7. Thoat");
            System.out.print("Chon mot tuy chon: ");        
    }
}
