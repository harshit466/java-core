package com.learning.core.day7;
import java.util.Stack;

public class D07P03 {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop each character from the stack to construct the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "JavaQuiz";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }
}