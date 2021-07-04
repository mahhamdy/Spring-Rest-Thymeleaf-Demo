package com.afaqy.demo.controller;

import com.afaqy.demo.model.Book;
import com.afaqy.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Mahmoud Hamdy
 * @Date: 2021-07-04
 */
@Controller
public class BookViewController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("booksList", bookService.getAllBooks());
        return "index";
    }

    @GetMapping("/showNewBookForm")
    public String showNewBookForm(Model model) {
        // create model attribute to bind form data
        Book book = new Book();
        model.addAttribute("book", book);
        return "new_book";
    }

    @PostMapping("/addBook")
    public String addStudent(@ModelAttribute("book") Book book) {
        bookService.addBook(book);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        // set employee as a model attribute to pre-populate the form
        model.addAttribute("book", bookService.getBookById(id));
        return "update_book";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") long id) {
        bookService.removeBook(id);
        return "redirect:/";
    }

}
