package com.bookstore.ms_book.service;

import com.bookstore.ms_book.dto.BookRequest;
import com.bookstore.ms_book.dto.BookResponse;
import com.bookstore.ms_book.entity.Book;
import com.bookstore.ms_book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {

    private final BookRepository bookRepository;

    //create book
    public BookResponse addBook(BookRequest request){
        Book book = Book.builder()
                .id(request.id())
                .title(request.title())
                .author(request.author())
                .description(request.description())
                .price(request.price())
                .build();

        bookRepository.save(book);
        log.info("Book create successfully{}", book);
        return new BookResponse(book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getDescription(),
                book.getPrice());
    }
    //get book by id
    public Optional<BookResponse> getBookById(Long id){
        return bookRepository.findById(id)
                .map(book -> new BookResponse(book.getId(),
                        book.getTitle(),
                        book.getAuthor(),
                        book.getDescription(),
                        book.getPrice()));
    }
    //get all books
    public List<BookResponse> getAllBooks(){
        return bookRepository.findAll()
                .stream()
                .map(book -> new BookResponse(book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getDescription(),
                book.getPrice()))
                .toList();
    }
    //get book by param
    //update book
    //remove book




}
