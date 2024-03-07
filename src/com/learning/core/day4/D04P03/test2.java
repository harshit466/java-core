package com.learning.core.day4.D04P03;
import java.util.Scanner;

public class test2 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Validator validator = new Validator();

	        System.out.println("Enter applicant details:");
	        System.out.print("Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Designation: ");
	        String designation = scanner.nextLine();

	        System.out.print("Age: ");
	        int age = scanner.nextInt();

	        Applicant applicant = new Applicant(name, designation, age);

	        try {
	            validator.validate(applicant);
	        } catch (CatheyBankException e) {
	            System.out.println(e.getMessage());
	        }

	        scanner.close();
	    }
}
