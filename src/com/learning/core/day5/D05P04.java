package com.learning.core.day5;
import java.util.HashSet;
import java.util.HashSet;
import java.util.Scanner;


public class D05P04 {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product id and name to search (e.g., P003 Maruti Dezire):");
        String[] input = scanner.nextLine().split(" ");
        Product searchProduct = new Product(input[0], input[1]);

        if (products.contains(searchProduct)) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}