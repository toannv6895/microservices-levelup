package com.toannguyen.service1.controllers;

import com.toannguyen.service1.models.entities.Book;
import com.toannguyen.service1.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
@RequestMapping("/db")
public class BookController {
    private final BookRepository bookRepository;

    @GetMapping("/books")
    Flux<Book> getBooks() { return bookRepository.findAll(); }
}
