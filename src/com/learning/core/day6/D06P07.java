package com.learning.core.day6;
import java.util.*;

public class D06P07 {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();
        carMap.put(new Car("Bugatti", 80050.0), "Bugatti");
        carMap.put(new Car("Swift", 305000.0), "Swift");
        carMap.put(new Car("Audi", 600100.0), "Audi");
        carMap.put(new Car("Benz", 900000.0), "Benz");

        Map.Entry<Car, String> leastEntry = carMap.firstEntry();
        Map.Entry<Car, String> greatestEntry = carMap.lastEntry();

        System.out.println(leastEntry.getKey());
        System.out.println(greatestEntry.getKey());
    }
}