package com.learning.core.day2;
import java.util.Scanner;

public class D02P04 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Maximum number is: " + max);
	}
}
