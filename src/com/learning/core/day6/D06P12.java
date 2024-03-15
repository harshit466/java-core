package com.learning.core.day6;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class D06P12 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employees = new Hashtable<>();
        List<Employee> employeeList = new ArrayList<>();

        // Predefined employee details
        Employee emp1 = new Employee(1001, "Daniel ", "Analyst", "L&D");
        Employee emp2 = new Employee(1002, "Thomas ", "Tester", "Testing");
        Employee emp3 = new Employee(1003, "Robert", "Product Manager","Development");
        Employee emp4 = new Employee(1004, "Grace", "Tech Support", "HR");

        // Storing predefined employees in the HashTable and List
        employees.put(emp1.hashCode(), emp1);
        employees.put(emp2.hashCode(), emp2);
        employees.put(emp3.hashCode(), emp3);
        employees.put(emp4.hashCode(), emp4);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        // New employee details to add if not exists
        int idToAdd = 1005;
        Employee newEmp = new Employee(1005, "Charles", "QA Lead", "Testing");

        // Adding new employee if ID does not exist
        if (!employees.containsKey(idToAdd)) {
            employees.put(newEmp.hashCode(), newEmp);
            employeeList.add(newEmp);
        }

        // Printing details of all employees in reverse order
        Collections.reverse(employeeList);
        for (Employee emp : employeeList) {
            System.out.println(emp.toString());
        }
    }
}