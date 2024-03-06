package com.learning.core.day3;
import java.util.Scanner;

public class D03P02 {
	public static void main(String[] args) {
		int a1,b1;
		Scanner sc1=new Scanner(System.in);
		a1=sc1.nextInt();
		b1=sc1.nextInt();
		int[] arr1=new int[5];
		String result1;
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc1.nextInt();
		}
		int c1=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==a1)
				c1=1;
		}
		int d1=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==b1)
				d1=1;
		}
		if(c1==1&&d1==1)
			result1="Its Bingo";
		else
			result1="Not Found";
		
		
		int a2,b2;
		Scanner sc2=new Scanner(System.in);
		a2=sc2.nextInt();
		b2=sc2.nextInt();
		int[] arr2=new int[5];
		String result2;
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc2.nextInt();
		}
		int c2=0;
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]==a2)
				c2=1;
		}
		int d2=0;
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]==b2)
				d2=1;
		}
		if(c2==1&&d2==1)
			result2="Its Bingo";
		else
			result2="Not Found";
		
		System.out.println(result1);
		System.out.println(result2);

	}
}
