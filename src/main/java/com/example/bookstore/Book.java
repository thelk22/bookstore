package com.example.bookstore;

import lombok.Getter;

@Getter
public class Book {

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
