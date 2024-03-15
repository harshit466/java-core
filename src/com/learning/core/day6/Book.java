package com.learning.core.day6;
import java.util.*;

public class Book implements Comparable<Book> {
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
    public int getId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublicationDate() {
        return dateOfPublication;
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