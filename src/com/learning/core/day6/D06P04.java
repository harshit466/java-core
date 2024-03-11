package com.learning.core.day6;
import java.util.*;
import java.util.Date;
import java.util.TreeSet;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private Date dateOfPublication;
    private String author;

    public Book(int bookId, String title, double price, String author, Date dateOfPublication) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Price: " + price + ", Author: " + author + ", Date of Publication: " + dateOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, dateOfPublication, author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookId == book.bookId && Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) && Objects.equals(dateOfPublication, book.dateOfPublication) && Objects.equals(author, book.author);
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.author.compareTo(otherBook.author);
    }
}

public class D06P04 {
    public static void main(String[] args) {
        Set<Book> bookSet = new TreeSet<>();
        //@SuppressWarnings("deprecation");
        bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(84, 10, 23)));
        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(84, 10, 19)));
        bookSet.add(new Book(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(84, 2, 6)));
        bookSet.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", null));
        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", new Date(120, 1, 2)));

        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}