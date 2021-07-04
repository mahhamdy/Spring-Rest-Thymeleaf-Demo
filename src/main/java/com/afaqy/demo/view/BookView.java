//package com.afaqy.demo.view;
//
//import com.afaqy.demo.model.Book;
//import com.afaqy.demo.service.BookService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.view.ViewScoped;
//import java.io.Serializable;
//import java.util.List;
//
///**
// * @Author: Mahmoud Hamdy
// * @Date: 2021-07-01
// */
//@ManagedBean(name = "booksManagedBean")
//@ViewScoped
//public class BookView implements Serializable {
//
//    @Autowired
//    private BookService bookService;
//
//    private List<Book> bookList;
//
//    @PostConstruct
//    public void init() {
//        fillBooks();
//    }
//
//    public void fillBooks() {
//        bookList = bookService.getAllBooks();
//    }
//
//    public void createBook(Book newBook) {
//        bookService.addBook(newBook);
//    }
//
//    public void updateBook(Book newBook) {
//        bookService.addBook(newBook);
//    }
//
//    public void deleteBook(Book newBook) {
//        bookService.removeBook(newBook.getId());
//    }
//
//    // setters & getters
//    public List<Book> getBookList() {
//        return bookList;
//    }
//
//    public void setBookList(List<Book> bookList) {
//        this.bookList = bookList;
//    }
//}
