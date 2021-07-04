package com.afaqy.demo.service;

import com.afaqy.demo.model.Book;

import java.util.List;

/**
 * @Author: Mahmoud Hamdy
 * @Date: 2021-07-01
 * <p>
 * You should implement BookService that has the following methods:
 * getAllBooks
 * getBookById
 * addBook
 * removeBook
 * No databases required, the BookService should have the following map as its store: private final Map<Long, Book> store;
 */
public interface BookService {

    List<Book> getAllBooks();

    Book getBookById(Long id);

    Book addBook(Book book);

    void removeBook(Long id);
}
