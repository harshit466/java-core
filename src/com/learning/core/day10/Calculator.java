package com.learning.core.day10;

public class Calculator {

     public int add(int a, int b)
     {
          return a + b;
        }

      public int sub(int a, int b) {
           return a-b;
      }
      public int mul(int a, int b)
      {
           return a * b;
         }

       public int div(int a, int b) {
            return a/b;
       }
       
       public int findMax (int[] arr) 
       {
    	   int max=0;
     	   for (int i=0; i < arr.length; i++) 
     	   {
    	      if (arr[i] > max) 
    	      {
              	   max= arr[i];
    	       }
    	   }
    	   return max;
    	}
}
