package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;

public class D07P07 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements (enter -1 to stop):");
        int element = scanner.nextInt();
        while (element != -1) {
            stack.push(element);
            element = scanner.nextInt();
        }

        boolean isTopEven = false;
        if (!stack.isEmpty() && stack.peek() % 2 == 0) {
            isTopEven = true;
        }

        System.out.println("Is the top element even? " + isTopEven);
    }
}