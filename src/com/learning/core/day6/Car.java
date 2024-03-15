package com.learning.core.day6;
import java.util.Map;
import java.util.TreeMap;

public class Car implements Comparable<Car> {
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
