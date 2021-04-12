package com.devik.springbootbookmanagement.controller;

import com.devik.springbootbookmanagement.entity.Book;
import com.devik.springbootbookmanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/updateBook/{id}")
    public Book updateBook(@PathVariable(name = "id") Long id, @RequestBody Book book) {
        book.setBookId(id);
        return bookService.addBook(book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable(name = "id") Long id) {
        bookService.deleteBook(id);
    }
}
