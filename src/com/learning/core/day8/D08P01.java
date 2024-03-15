package com.learning.core.day8;

import java.util.Scanner;

public class D08P01 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the queue :");
        for(int i=0;i<5;i++)
        {
        	int input=scanner.nextInt();
        	queue.enqueue(input);
        }
        System.out.print("Elements in queue: ");
        queue.display();

        queue.dequeue();
        System.out.print("After removing first element: ");
        queue.display();
    }
}