package com.learning.core.day6;
import java.util.*;
import java.util.Hashtable;

public class D06P10 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employees = new Hashtable<>();

        // Predefined employee details
        Employee emp1 = new Employee(101, "Alice", "IT", "Engineer");
        Employee emp2 = new Employee(102, "Bob", "HR", "Manager");
        Employee emp3 = new Employee(103, "Charlie", "Finance", "Analyst");
        Employee emp4 = new Employee(104, "David", "Marketing", "Coordinator");

        // Storing employees in the HashTable
        employees.put(emp1.hashCode(), emp1);
        employees.put(emp2.hashCode(), emp2);
        employees.put(emp3.hashCode(), emp3);
        employees.put(emp4.hashCode(), emp4);

        // Verifying if the HashTable is empty
        System.out.println(employees.isEmpty());
    }
}