package com.learning.core.day2;
import java.util.Scanner;
public class D02P14 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        int result = power(base, exponent);
        System.out.println("The result is: " + result);
    }
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++){
            result *= base;
        }
        return result;
    }
}
