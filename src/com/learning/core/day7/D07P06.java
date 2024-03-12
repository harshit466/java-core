package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;

public class D07P06 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements (enter -1 to stop):");
        int element = scanner.nextInt();
        while (element != -1) {
            stack.push(element);
            if (minStack.isEmpty() || element <= minStack.peek()) {
                minStack.push(element);
            }
            element = scanner.nextInt();
        }

        System.out.println("Minimum element in stack: " + minStack.peek());
    }
}