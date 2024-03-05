package com.learning.core.day2;
import java.util.Scanner;
public class D02P08 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range (L and R): ");
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum +=i;
        }
        System.out.println("Sum of elements in the range of L and R: " + sum);
    }
}
