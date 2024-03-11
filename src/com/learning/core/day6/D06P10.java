package com.learning.core.day6;
import java.util.*;
import java.util.Hashtable;

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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class D06P10 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();

        Employee emp1 = new Employee(1, "John Doe", "IT", "Software Engineer");
        Employee emp2 = new Employee(2, "Jane Smith", "HR", "HR Manager");
        Employee emp3 = new Employee(3, "Alice Johnson", "Finance", "Accountant");
        Employee emp4 = new Employee(4, "Bob Brown", "Marketing", "Marketing Manager");

        employeeHashtable.put(emp1.id, emp1);
        employeeHashtable.put(emp2.id, emp2);
        employeeHashtable.put(emp3.id, emp3);
        employeeHashtable.put(emp4.id, emp4);

        System.out.println(employeeHashtable.isEmpty());
    }
}