package com.learning.core.day8;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class D08P02 {
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
        queue.dequeue();

        System.out.print("After removing two elements: ");
        queue.display();
    }
}