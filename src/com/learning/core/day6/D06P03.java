package com.learning.core.day6;
import java.util.*;
import java.util.TreeSet;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Comparator;

public class D06P03 {
    public static void main(String[] args) {

    	TreeSet<Book> books = new TreeSet<>();

        // Predefined information of 5 Book details
        Book book1 = new Book(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(2, 2, 2020));
        Book book2 = new Book(1002, "Modern Mainframe", 295.0, "Sharad", new Date(97, 4, 19));
        Book book3 = new Book(1003, "Java Programming", 295.0, "Gilad Bracha", new Date(84, 10, 23));
        Book book4 = new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(84, 10, 19));
        Book book5 = new Book(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(84, 2, 6));

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        // Print all the Book details
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        for (Book book : books) {
            System.out.print("Book ID: " + book.getId());
            System.out.print("Title: " + book.getTitle());
            System.out.print("Price: " + book.getPrice());
            System.out.print("Author: " + book.getAuthor());
            System.out.print("Publication Date: " + dateFormat.format(book.getPublicationDate()));
            System.out.println();
        }
    }
}
