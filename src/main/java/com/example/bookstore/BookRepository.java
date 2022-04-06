package com.example.bookstore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookRepository implements IBookRepository  {

    private List<Book> books;

    public BookRepository() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("LOTR", "J.R.R. Tolkien"));
        books.add(new Book("A Gentleman in Moscow", "Amor Towles"));
        books.add(new Book("Outliers", "Malcolm Gladwell"));
        this.books = books;
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

}
