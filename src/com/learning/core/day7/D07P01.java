package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P01 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
              
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");
        System.out.println("After Pushing Four Elements: " + stack);

        if (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        System.out.println("After a pop: " + stack);
    }
}
