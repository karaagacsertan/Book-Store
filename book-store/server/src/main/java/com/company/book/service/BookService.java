package com.company.book.service;

import com.company.book.entity.Book;

import java.util.List;

public interface BookService {
   Book saveBook(Book person);

   boolean deleteBook(long id);

   List<Book> getAllBooks();

   Book getById(long id);

   Book updateBook(long id, Book person);


}
