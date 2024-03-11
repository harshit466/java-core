package com.learning.core.day6;
import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P08 {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();

        carMap.put(new Car("Bugatti", 80050.0), "Bugatti Details");
        carMap.put(new Car("Swift", 305000.0), "Swift Details");
        carMap.put(new Car("BMW", 600100.0), "BMW Details");

        System.out.println("Initial TreeMap: ");
        for (Map.Entry<Car, String> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Removing the first car
        Car firstCar = carMap.firstKey();
        carMap.remove(firstCar);

        System.out.println("\nAfter removing the first car (the cheapest one): ");
        for (Map.Entry<Car, String> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Getting the key-value mapping associated with the greatest (most expensive) car
        Car lastCar = carMap.lastKey();
        String lastCarDetails = carMap.get(lastCar);

        System.out.println("\nDetails of the most expensive car: ");
        System.out.println(lastCar + " -> " + lastCarDetails);
    }
}