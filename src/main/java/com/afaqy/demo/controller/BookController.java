package com.afaqy.demo.controller;

import com.afaqy.demo.model.Book;
import com.afaqy.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Mahmoud Hamdy
 * @Date: 2021-07-01
 * <p>
 * Create Bookstore application that have the books CRUD operations:
 * Reading all the books.
 * Creating a book.
 * Updating a book.
 * Deleting a book.
 * <p>
 * The Bookstore application should be used from the browser as a normal website and consumed as a RESTful Web Service.
 */
@RestController
@RequestMapping("/springDemo/books")  // URL
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/")
    public List<Book> findAll() {
        return bookService.getAllBooks();
    }

    @PostMapping(value = "/create/")
    public Book createNewBook(@RequestBody Book newBook) {
        return bookService.addBook(newBook);
    }

    @PutMapping(path = "/update/")
    public Book updateUser(@RequestBody Book book) {
        bookService.addBook(book);
        return book;
    }

    @GetMapping(value = "/{id}")
    public Book findById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        bookService.removeBook(id);
        return "deleted";
    }


}
