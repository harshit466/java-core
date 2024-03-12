package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Collection;
import java.util.ArrayList;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + "\n" + department + "\n";
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P14 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined information of 4 Employee details
        Employee employee1 = new Employee(1006, "Henry", "Finance", "Accountant");
        Employee employee2 = new Employee(1005, "Charles", "Testing", "QA Lead");
        Employee employee3 = new Employee(1004, "Grace", "HR", "Tech Support");
        Employee employee4 = new Employee(1003, "Robert", "Development", "Product Manager");

        employeeTable.put(employee1.hashCode(), employee1);
        employeeTable.put(employee2.hashCode(), employee2);
        employeeTable.put(employee3.hashCode(), employee3);
        employeeTable.put(employee4.hashCode(), employee4);

        // Collection with some data
        Hashtable<Integer, Employee> otherTable = new Hashtable<>();
        Employee employee5 = new Employee(1002, "Thomas", "Testing", "Tester");
        Employee employee6 = new Employee(1001, "Daniel", "L&D", "Analyst");
        otherTable.put(employee5.hashCode(), employee5);
        otherTable.put(employee6.hashCode(), employee6);

        // Add the Employee details from otherTable to employeeTable
        Collection<Employee> values = otherTable.values();
        for (Employee e : values) {
            employeeTable.putIfAbsent(e.hashCode(), e);
        }

        // Print employeeTable
        for (Employee e : employeeTable.values()) {
            System.out.println(e);
        }
    }
}