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
        return name + " " + price;
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
    public int compareTo(Car otherCar) {
        return Double.compare(price, otherCar.price);
    }
}

public class D06P06 {
    public static void main(String[] args) {
        Map<Car, Double> carMap = new TreeMap<>();
        carMap.put(new Car("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car("Swift", 305000.0), 305000.0);
        carMap.put(new Car("Audi", 600100.0), 600100.0);
        carMap.put(new Car("Benz", 900000.0), 900000.0);

        List<Car> carsList = new ArrayList<>(carMap.keySet());
        Collections.reverse(carsList);

        for (Car car : carsList) {
            System.out.println(car);
        }
    }
}