package jug.istanbul.okr.chapter08;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookStore {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1000, "Adam Go"));
        books.add(new Book(500, "Mehmet Go"));
        books.add(new Book(5000, "Go Go"));
        BookStore.calculatePrice(books, b -> b.isBigBook(b));
    }

    public static void calculatePrice(List<Book> books, BookCategory bookCategory) {

        books.stream().
                filter(bookCategory::isBigBook).
                forEach(System.out::println);

    }
}
