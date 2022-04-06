package com.example.bookstore;

import java.util.List;

public interface IBookRepository {

    List<Book> findAll();
}
