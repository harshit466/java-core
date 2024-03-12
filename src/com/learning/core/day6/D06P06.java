package com.learning.core.day6;
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
    public int compareTo(Car o) {
        return Double.compare(o.price, this.price);
    }
}

public class D06P05 {
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
