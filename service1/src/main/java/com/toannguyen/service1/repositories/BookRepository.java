package com.toannguyen.service1.repositories;

import com.toannguyen.service1.models.entities.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BookRepository extends ReactiveCrudRepository<Book, String> {
}
