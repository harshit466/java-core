package com.learning.core.day8;
import java.util.Scanner;

class CircularQueue {
    private static final int MAX_SIZE = 5;
    private int[] arr;
    private int front;
    private int rear;

    public CircularQueue() {
        arr = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if ((front == 0 && rear == MAX_SIZE - 1) || (rear == (front - 1) % (MAX_SIZE - 1))) {
            System.out.println("Queue is full");
            return;
        } else if (front == -1) {
            front = rear = 0;
            arr[rear] = data;
        } else if (rear == MAX_SIZE - 1 && front != 0) {
            rear = 0;
            arr[rear] = data;
        } else {
            rear++;
            arr[rear] = data;
        }
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        int data = arr[front];
        arr[front] = -1;
        if (front == rear) {
            front = rear = -1;
        } else if (front == MAX_SIZE - 1) {
            front = 0;
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
        
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = front; i < MAX_SIZE; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

public class D08P03 {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the queue :");
        for(int i=0;i<4;i++)
        {
        	int input=scanner.nextInt();
        	queue.enqueue(input);
        }
        System.out.print("Elements in circular queue: ");
        queue.display();
        queue.dequeue();
        System.out.print("After removing first element: ");
        queue.display();
    }
}