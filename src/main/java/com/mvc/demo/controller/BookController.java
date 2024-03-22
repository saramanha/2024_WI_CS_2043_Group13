package com.mvc.demo.controller;

import com.mvc.demo.model.Book;
import com.mvc.demo.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/")
    public String showBookList(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        model.addAttribute("book", new Book()); // Make sure this matches your Thymeleaf form's `th:object`
        return "books";
    }

    @PostMapping("/addBook")
    public String addBook(Book book) {
        bookRepository.save(book);
        return "redirect:/";
    }
}

