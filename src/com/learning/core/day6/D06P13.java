package com.learning.core.day6;
import java.util.Hashtable;

public class D06P13 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employees = new Hashtable<>();

        // Predefined employee details
        Employee emp1 = new Employee(1001, "Alice", "IT", "Engineer");
        Employee emp2 = new Employee(1002, "Bob", "HR", "Manager");
        Employee emp3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee emp4 = new Employee(1004, "David", "Marketing", "Coordinator");
        Employee emp5 = new Employee(1005, "Charles", "QA Lead", "Testing");

        // Storing predefined employees in the HashTable
        employees.put(emp1.hashCode(), emp1);
        employees.put(emp2.hashCode(), emp2);
        employees.put(emp3.hashCode(), emp3);
        employees.put(emp4.hashCode(), emp4);
        employees.put(emp5.hashCode(), emp5);

        // Getting the number of keys in the HashTable
        int numberOfKeys = employees.size();
        System.out.println(numberOfKeys);
    }
}