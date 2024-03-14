package com.learning.core.day8;

import java.util.Scanner;

class Queue {
    private static final int MAX_SIZE = 10;
    private int[] arr;
    private int front;
    private int rear;

    public Queue() {
        arr = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = data;
        if (front == -1) {
            front = 0;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

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