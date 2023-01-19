package com.toannguyen.service1.models.entities;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Book {
    @Id
    private String bookId;
    @NonNull
    private String title;
    @NonNull
    private String author;
}