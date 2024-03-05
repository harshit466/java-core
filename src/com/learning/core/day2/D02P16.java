package com.learning.core.day2;
import java.util.Scanner;
public class D02P16 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        int first = 0;
	        int second = 1;
	        int fibonacci = 0;

	        for (int i = 1; i <= n; i++) {
	            if (i == 1) {
	                System.out.print(first + ", ");
	                continue;
	            }
	            if (i == 2) {
	                System.out.print(second + ", ");
	                continue;
	            }
	            fibonacci = first + second;
	            first = second;
	            second = fibonacci;

	            System.out.print(fibonacci + ", ");
	        }
	    }

}
