package com.learning.core.day6;
import java.util.Map;
import java.util.TreeMap;

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<Car, Double> carMap = new TreeMap<>();
        carMap.put(new Car("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car("Swift", 305000.0), 305000.0);
        carMap.put(new Car("Ferrari", 600100.0), 600100.0);
        carMap.put(new Car("Reva", 80050.0), 80050.0); // Added Reva
        double newPrice = 80050.0;
        Car reva = new Car("Reva", newPrice);
        carMap.replace(reva, newPrice);
        System.out.print("Reva"+" ");
        System.out.print(newPrice);
        
    }
}