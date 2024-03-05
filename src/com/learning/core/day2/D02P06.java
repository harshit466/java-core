package com.learning.core.day2;
import java.util.Scanner;

public class D02P06 {
   public static void main(String[] args){
	   Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number representing the day of the week (1-7): ");
       int dayOfWeek = scanner.nextInt();

       if (dayOfWeek >= 1 && dayOfWeek <= 7) {
           String weekday;
           if(dayOfWeek==0) {weekday = "Sunday";
      
           }
           else if(dayOfWeek==1) {weekday = "Monday";
    
           }
           else if(dayOfWeek==2) { weekday = "Tuesday";
      
           }
           else if(dayOfWeek==3) {weekday = "Wednesday";
       
           }
           else if(dayOfWeek==4) {weekday = "Thursday";;
      
           }
           else if(dayOfWeek==5) {weekday = "Friday";;
      
           }
           else if(dayOfWeek==6) {weekday = "Saturday";;
       
           }
           else
           {
        	   weekday = "Invalid Input";
           }
           System.out.println(weekday);
       } else {
           System.out.println("Invalid Input");
       }
   
   }
	
}
