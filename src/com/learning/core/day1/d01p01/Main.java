package com.learning.core.day1.d01p01;

public class Main {
	public static void main(String[] args) {
        String book_title = "Java Programming";
        double book_price = 350.00;
        Book book = createBooks(book_title, book_price);
        showBooks(book);
    }

    public static Book createBooks(String title, double price) {
        Book book = new Book();
        book.setTitle(title);
        book.setPrice(price);
        return book;
    }

    public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getTitle() + " and Price: " + book.getPrice());
    }
}
