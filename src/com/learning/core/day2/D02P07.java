package com.learning.core.day2;
import java.util.Scanner;

public class D02P07 {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the percentage: ");
    int percentage = scanner.nextInt();
    if (percentage >= 60) {
        System.out.println("A Grade");
    }
    else if (percentage >= 45) {
    	System.out.println("B Grade");
    }
    else if (percentage >= 35) {
    	System.out.println("C Grade");
    }
    else if (percentage < 35)
    {
    	System.out.println("Fail");
    }
	}
}
