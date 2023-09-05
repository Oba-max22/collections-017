package org.example.book;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private Double price;
    private String name;
    private String author;

    public Book(String author, String name, Double price) {
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        if (this.price > book.getPrice()) {
            return 1;
        } else if (this.price < book.getPrice()) {
            return -1;
        } else if (Objects.equals(this.price, book.getPrice())) {
            return 0;
        } else {
            return this.price.compareTo(book.getPrice());
        }
    }
}