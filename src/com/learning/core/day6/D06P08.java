package com.learning.core.day6;
import java.util.Map;
import java.util.TreeMap;

public class D06P08 {
    public static void main(String[] args) {
        TreeMap<Car, Double> carMap = new TreeMap<>();
        carMap.put(new Car("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car("Swift", 305000.0), 305000.0);
        carMap.put(new Car("Ferrari", 600100.0), 600100.0);

        System.out.println("Original TreeMap:");
        for (Map.Entry<Car, Double> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        Car bugatti = new Car("Bugatti", 80050.0);
        System.out.println("\nRemoving Bugatti:");
        carMap.remove(bugatti);
        for (Map.Entry<Car, Double> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\nGetting the greatest key-value mapping:");
        System.out.println(carMap.lastEntry().getKey() + " => " + carMap.lastEntry().getValue());
    }
}