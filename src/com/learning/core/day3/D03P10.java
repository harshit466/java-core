package com.learning.core.day3;
import java.util.Scanner;

public class D03P10 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    String input = scanner.nextLine();
    System.out.println(longestPrefixSuffix(input));
	}
    public static int longestPrefixSuffix(String s) {
    int n = s.length();
    for (int i = n / 2; i > 0; i--) {
        String prefix = s.substring(0, i);
        String suffix = s.substring(n - i);
        if (prefix.equals(suffix)) {
            return i;
        }
    }
    return 0;
    }
}
