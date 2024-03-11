package com.learning.core.day3;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class D03P12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
    	//String input = "Helloword";
        if (canSplitIntoFourDistinctStrings(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean canSplitIntoFourDistinctStrings(String input) {
        int n = input.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    String s1 = input.substring(0, i);
                    String s2 = input.substring(i, j);
                    String s3 = input.substring(j, k);
                    String s4 = input.substring(k);
                    if (areDistinct(s1, s2, s3, s4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean areDistinct(String... strings) {
        Set<String> set = new HashSet<>();
        for (String s : strings) {
            if (set.contains(s)) {
                return false;
            }
            set.add(s);
        }
        return true;
    }
}