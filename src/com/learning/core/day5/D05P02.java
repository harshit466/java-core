package com.learning.core.day5;
import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student names separated by spaces:");
        String[] names = scanner.nextLine().split(" ");
        for (String name : names) {
            studentList.add(name);
        }

        System.out.println("Enter the name to find:");
        String searchName = scanner.next();

        if (studentList.contains(searchName)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}