package com.learning.core.day5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class D05P05 {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product id to remove:");
        String removeProductId = scanner.next();

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(removeProductId)) {
                iterator.remove();
                break;
            }
        }

        for (Product product : products) {
            System.out.println(product);
        }
    }
}