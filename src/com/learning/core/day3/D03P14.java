package com.learning.core.day3;
import java.util.*;
public class D03P14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int[] arr1 = new int[m];
        for(int i=0;i<m;i++)		
        {
        	arr1[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++)		
        {
        	arr2[i]=sc.nextInt();
        }
        System.out.print("Union: ");
        printUnion(arr1, arr2, m, n);

        System.out.print("\nIntersection: ");
        printIntersection(arr1, arr2, m, n);
    }

    public static void printUnion(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
            } else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j++] + " ");
            } else {
                System.out.print(arr1[i++] + " ");
                j++;
            }
        }

        while (i < m) {
            System.out.print(arr1[i++] + " ");
        }

        while (j < n) {
            System.out.print(arr2[j++] + " ");
        }
    }

    public static void printIntersection(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                System.out.print(arr2[j] + " ");
                i++;
                j++;
            }
        }
    }
}
