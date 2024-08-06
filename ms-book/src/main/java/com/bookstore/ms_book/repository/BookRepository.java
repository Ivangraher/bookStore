package com.bookstore.ms_book.repository;

import com.bookstore.ms_book.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Long> {
}
