package com.learning.core.day10;
import java.io.*;
import java.util.Scanner;

public class D10P02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    if (name.isBlank()) {
                        throw new BlankFieldException("Name cannot be blank.");
                    }

                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();

                    if (address.isBlank()) {
                        throw new BlankFieldException("Address cannot be blank.");
                    }

                    Student student = new Student(rollNumber, name, age, address);
                    System.out.println("Student created: " + student);

                    System.out.print("Do you want to write the data to a file? (yes/no): ");
                    String answer = scanner.nextLine().toLowerCase();

                    if (answer.equals("yes")) {
                        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student_records.txt", true))) {
                            oos.writeObject(student);
                            System.out.println("Student record saved to file.");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Roll Number and Age must be numeric.");
                } catch (BlankFieldException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}