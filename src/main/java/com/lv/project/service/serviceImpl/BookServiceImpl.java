package com.lv.project.service.serviceImpl;

import com.lv.project.dtos.BookDTO;
import com.lv.project.model.Books;
import com.lv.project.repositories.BookRepository;
import com.lv.project.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Books createBook(BookDTO bookDTO) {
        Books books = new Books(bookDTO.getTitle(),bookDTO.getAuthor());
        return bookRepository.save(books);
    }


}
