package com.lv.project.service;

import com.lv.project.dtos.BookDTO;
import com.lv.project.model.Books;

import java.awt.print.Book;

public interface BookService {

    Books createBook(BookDTO bookDTO);


}
