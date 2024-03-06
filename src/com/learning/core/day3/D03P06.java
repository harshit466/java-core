package com.learning.core.day3;
import java.util.Scanner;
public class D03P06 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input: ");
	        String input = scanner.nextLine();
	        System.out.print("n: ");
	        int n = scanner.nextInt();
	        int vowelCount = countVowels(input);
	
	        if (n>vowelCount) {
	        	System.out.println("Mismatch in Vowel Count");
	        } else {
	        	for (char c : input.toLowerCase().toCharArray()) {
		            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		            	System.out.print(c);
		            }
		        } 
	        }
	    }
	    private static int countVowels(String input) {
	        int count = 0;
	        for (char c : input.toLowerCase().toCharArray()) {
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                count++;
	            }
	        }
	        return count;
	    }
}
