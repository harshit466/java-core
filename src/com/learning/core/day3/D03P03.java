package com.learning.core.day3;
import java.util.Scanner;
public class D03P03 {
	public static void main(String[] args) {
        //int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
        // Compute the sum of elements 
		Scanner sc=new Scanner(System.in);
        int n=18;
        int[] A = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += A[i];
        }
        A[15] = sum; 
        double average = (double) sum/ 18;
        A[16] = (int) Math.round(average);

        // Identify the smallest value 
        int min = A[0];
        for (int i = 1; i < 15; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        A[17] = min;
        // Print the array A
        for (int i = 0; i < 18; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
