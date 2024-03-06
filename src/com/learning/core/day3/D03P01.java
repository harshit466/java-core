package com.learning.core.day3;
import java.util.Scanner;
public class D03P01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int length = input.length();
        System.out.println("Length of the string: " + length);

        // Display string in uppercase
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercase);

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

    public static boolean checkPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
