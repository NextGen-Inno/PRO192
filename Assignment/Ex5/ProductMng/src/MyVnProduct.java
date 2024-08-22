
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class MyVnProduct implements VNProduct {
    
    @Override
    public int f1(List<Product> p) {
        int count = 0;
        for (Product product : p) {
            if (product.getPrice() > 100000) {
                count++;
            }
        }
        return count;
    }

    @Override
    public double f2(List<Product> p) {
        double total = 0;
        for (Product product : p) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public void f3(List<Product> p) {
        for (Product product : p) {
            if (product.getPrice() < 50000) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void f4(List<Product> p) {
        p.sort(Comparator.comparing(Product::getName));
        for (int i = 0; i < 4 && i < p.size(); i++) {
            System.out.println(p.get(i));
        }
    }

    @Override
    public void f5(List<Product> p) {
        List<Product> filProducts = new ArrayList<>();
        for (Product product : p) {
            if (product.getName().endsWith("a")) {
                filProducts.add(product);
            }
        }
        filProducts.sort(Comparator.comparing(Product::getPrice).reversed());
        for (Product product : filProducts) {
            System.out.println(product);
        }
    }

    public void addProduct(List<Product> prdList, Product product) {
        prdList.add(product);
    }
    
}
