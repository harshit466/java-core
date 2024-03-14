package com.learning.core.day8;
import java.util.*;
import java.util.Queue;

public class D08P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        System.out.println("Enter elements for the queue (separated by spaces):");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
            queue.add(element);
        }

        System.out.println(queue.isEmpty() ? "Empty" : "Not Empty");

        scanner.close();
    }
}


