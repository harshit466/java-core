package com.learning.core.day6;

public class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private String dateOfPublication;

    public Book(int bookId, String title, double price, String author, String dateOfPublication) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    // Getters and setters

    @Override
    public String toString() {
        return bookId + " " + title + " " + price + " " + author + " " + dateOfPublication;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(bookId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookId == book.bookId;
    }

    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.bookId, otherBook.bookId);
    }}