package com.learning.core.day3;
import java.util.Scanner;
public class D03P07 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();

        System.out.println("Output:");
        printSubsequences(input, "");
    }

    private static void printSubsequences(String input, String output) {
        if (input.length() == 0) {
            if (!output.equals("")) {
                System.out.println(output);
            }
            return;
        }
        printSubsequences(input.substring(1), output);
        printSubsequences(input.substring(1), output + input.charAt(0));
    }
}
