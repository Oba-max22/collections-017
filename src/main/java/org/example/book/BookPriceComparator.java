package org.example.book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return Double.compare(book1.getPrice(), book2.getPrice());
    }
}
