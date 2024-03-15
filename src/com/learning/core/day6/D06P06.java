package com.learning.core.day6;
import java.util.*;

public class D06P06 {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>(Collections.reverseOrder());
        carMap.put(new Car("Bugatti", 80050.0), "Bugatti");
        carMap.put(new Car("Swift", 305000.0), "Swift");
        carMap.put(new Car("Audi", 600100.0), "Audi");
        carMap.put(new Car("Benz", 900000.0), "Benz");

        for (Map.Entry<Car, String> entry : carMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
