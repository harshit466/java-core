package com.learning.core.day3;
import java.util.Scanner;

public class D03P13 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     String input=sc.nextLine();
        String output = replaceSpaces(input);
        System.out.println(output);
    }

    public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
