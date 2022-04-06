package com.example.bookstore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookRepository implements IBookRepository  {

    @Override
    public List<Book> findAll() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("LOTR", "J.R.R. Tolkien"));
        bookList.add(new Book("A Gentleman in Moscow", "Amor Towles"));
        bookList.add(new Book("Outliers", "Malcolm Gladwell"));
        return bookList;
    }

}
