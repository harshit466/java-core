package com.learning.core.day2;
import java.util.Scanner;
public class D02P03 {
	public static void main(String[] args) {
		int a,b;
		int result=0;
		char operator;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers and operator");
		a=sc.nextInt();
		b=sc.nextInt();
		operator=sc.next().charAt(0);
		switch(operator) {
        case '+':
            result = a+b;
            break;
        case '-':
            result = a-b;
            break;
        case '*':
            result = a*b;
            break;
        case '/':
            if (b!= 0) {
                result = a / b;
            } else {
                System.out.println("Infinity");
            }
            break;
        default:
            System.out.println("Invalid operator.");
            break;
	}
		System.out.println(result);
	}
}
