package com.learning.core.day5.D05P01;
import java.util.Random;
import java.util.Scanner;

/*
public class Test {
    public static void main(String[] args) {
        Register<Employee> employeeRegister = new Register<>("ASK3EWZ");
        Employee employee = new Employee("Arun", 9123456780L, "1101 LA788330G", 12345);
        employeeRegister.display(employee);

        Register<Student> studentRegister = new Register<>("XSQ9EHZ");
        Student student = new Student("Joseph", 9123412780L, "2210 SJAD1717K");
        studentRegister.display(student);
    }
}
*/
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String employeeName = scanner.nextLine();

        System.out.println("Enter employee phone number:");
        long employeePhoneNumber = Long.parseLong(scanner.nextLine());

        System.out.println("Enter employee PAN number:");
        String employeePAN = scanner.nextLine();

        System.out.println("Enter employee ID:");
        int employeeID = Integer.parseInt(scanner.nextLine());

        Register<Employee> employeeRegister = new Register<>("ASK3EWZ");
        Employee employee = new Employee(employeeName, employeePhoneNumber, employeePAN, employeeID);
        employeeRegister.display(employee);

        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

        System.out.println("Enter student phone number:");
        long studentPhoneNumber = Long.parseLong(scanner.nextLine());

        System.out.println("Enter student PAN number:");
        String studentPAN = scanner.nextLine();

        Register<Student> studentRegister = new Register<>("XSQ9EHZ");
        Student student = new Student(studentName, studentPhoneNumber, studentPAN);
        studentRegister.display(student);

        scanner.close();
    }
}
