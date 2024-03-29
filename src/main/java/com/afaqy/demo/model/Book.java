package com.afaqy.demo.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @Author: Mahmoud Hamdy
 * @Date: 2021-07-03
 * Book model should have the following fields:
 * ID: long
 * Title: string
 * ISBN: string
 * Author: string
 */
public class Book implements Serializable {
    private Long id;
    private String title;
    private String isbn;
    private String author;

    public Book() {
    }

    public Book(Long id, String title, String isbn, String author) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
