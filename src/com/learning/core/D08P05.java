package com.learning.core.day8;
import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class D08P05 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer>[] queues = new Queue[2];
        queues[0] = new LinkedList<>(); // Odd numbers queue
        queues[1] = new LinkedList<>(); // Even numbers queue

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the queue (separated by spaces):");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
                int value = Integer.parseInt(element);
                queue.add(value);
            }
       
        while (!queue.isEmpty()) {
            int num = queue.poll();
            queues[num % 2].add(num);
        }

        System.out.println("Odd Queue: " + queues[1]);
        System.out.println("Even Queue: " + queues[0]);
    }
}