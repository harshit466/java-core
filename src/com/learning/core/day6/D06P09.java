package com.learning.core.day6;
import java.util.Map;
import java.util.TreeMap;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Double.hashCode(price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 && name.equals(car.name);
    }

    @Override
    public int compareTo(Car o) {
        return Double.compare(this.price, o.price);
    }
}

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<Car, Double> carMap = new TreeMap<>();
        carMap.put(new Car("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car("Swift", 305000.0), 305000.0);
        carMap.put(new Car("Ferrari", 600100.0), 600100.0);
        carMap.put(new Car("Reva", 80050.0), 80050.0); // Added Reva

        System.out.println("Original TreeMap:");
        for (Map.Entry<Car, Double> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        double newPrice = 80050.0;
        Car reva = new Car("Reva", newPrice);
        System.out.println("\nReplacing value for Reva:");
        carMap.replace(reva, newPrice);
        for (Map.Entry<Car, Double> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}