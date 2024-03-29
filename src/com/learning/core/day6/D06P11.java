package com.learning.core.day6;
import java.util.Hashtable;

public class D06P11 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employees = new Hashtable<>();

        // Predefined employee details
        Employee emp1 = new Employee(1001, "Alice", "IT", "Engineer");
        Employee emp2 = new Employee(1002, "Bob", "HR", "Manager");
        Employee emp3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee emp4 = new Employee(1004, "David", "Marketing", "Coordinator");

        // Storing employees in the HashTable
        employees.put(emp1.hashCode(), emp1);
        employees.put(emp2.hashCode(), emp2);
        employees.put(emp3.hashCode(), emp3);
        employees.put(emp4.hashCode(), emp4);

        // Searching for employee by ID
        int searchId = 1003;
        Employee foundEmployee = employees.get(searchId);
        if (foundEmployee != null) {
            System.out.println(searchId + " " + foundEmployee.toString());
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}