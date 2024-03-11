package com.learning.core.day6;
import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
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
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car o) {
        return Double.compare(this.price, o.price);
    }
}

public class D06P07 {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();
        carMap.put(new Car("Toyota", 25000), "Toyota");
        carMap.put(new Car("Honda", 30000), "Honda");
        carMap.put(new Car("Ford", 20000), "Ford");
        carMap.put(new Car("Chevrolet", 18000), "Chevrolet");

        System.out.println("Car details in TreeMap: ");
        for (Map.Entry<Car, String> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nThe key-value mapping associated with the greatest price: ");
        System.out.println(carMap.lastEntry());

        System.out.println("\nThe key-value mapping associated with the least price: ");
        System.out.println(carMap.firstEntry());
    }
}