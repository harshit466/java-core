package com.learning.core.day1;

public class Book {
	String book_title;
    double book_price;

   public String getTitle() {
       return book_title;
   }

   public void setTitle(String title) {
        book_title = title;
   }

   public double getPrice() {
       return book_price;
   }

   public void setPrice(double price) {
       book_price = price;
   }
}
