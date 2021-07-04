package com.afaqy.demo.service;

import com.afaqy.demo.model.Book;
import com.afaqy.demo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
@Service
public class BookServiceImp implements BookService {

    private final Map<Long, Book> store = new HashMap<>();

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>(store.values());
        System.out.println(books.size());
        for (Book b : books) {
            System.out.println(b.toString());
        }
        return books;
    }

    @Override
    public Book getBookById(Long id) {
        return store.get(id);
    }

    @Override
    public Book addBook(Book newBook) {
        store.put(newBook.getId(), newBook);
        System.out.println("Book inserted successfully");
        return newBook;
    }

    @Override
    public void removeBook(Long id) {
        store.remove(id);
        System.out.println("Book deleted successfully");
    }
}
