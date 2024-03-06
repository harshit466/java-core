package com.learning.core.day3;
import java.util.Scanner;
import java.util.*;
public class D03P04 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (map.containsKey(arr[i])) {
                minIndex = i;
            } 
            else {
                map.put(arr[i], i);
            }
        }

        if (minIndex == Integer.MAX_VALUE) {
            System.out.println("No repeating element found");
        } else {
            System.out.println( minIndex);
        }
    }
}
