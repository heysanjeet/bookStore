package com.wecode.bookStore.controller;

import com.wecode.bookStore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto book = BookDto.builder().tittle("This  is my first book").build();
        BookDto book2 = BookDto.builder().tittle("This  is my second book").build();
        List<BookDto> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        return ResponseEntity.ok(books);
    }
}
