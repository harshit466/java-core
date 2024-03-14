package com.learning.core.day9;
import java.util.Scanner;

public class D09P03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
             arr[i] = scanner.nextInt(); 
            }
            System.out.println("Enter the element to find:");
            int elementToFind = scanner.nextInt(); 
            if (linearSearch(arr, elementToFind)) {
                System.out.println("Element is Present");
            } else {
                System.out.println("Element is not Present");
            }
        }
    public static boolean linearSearch(int[] arr, int elementToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                return true; 
            }
        }
        return false; 
    }
}