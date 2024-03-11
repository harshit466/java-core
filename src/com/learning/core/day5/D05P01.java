package com.learning.core.day5.D05P01;
import java.util.Random;
import java.util.Scanner;


public class D05P01 {
    public static void main(String[] args) {
        Register<Employee> employeeRegister = new Register<>("ASK3EWZ");
        Employee employee = new Employee("Arun", 9123456780L, "1101 LA788330G", 12345);
        employeeRegister.display(employee);

        Register<Student> studentRegister = new Register<>("XSQ9EHZ");
        Student student = new Student("Joseph", 9123412780L, "2210 SJAD1717K");
        studentRegister.display(student);
    }
}


