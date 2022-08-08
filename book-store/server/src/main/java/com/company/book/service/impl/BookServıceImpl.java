package com.company.book.service.impl;

import com.company.book.entity.Book;
import com.company.book.repository.BookRepository;
import com.company.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServıceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book person) {
        return bookRepository.save(person);
    }

    @Override
    public boolean deleteBook(long id) {
        Book result= bookRepository.findById(id);

        if(result!=null){
            bookRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> getAllBooks() {

        return bookRepository.findAll();
    }

    @Override
    public Book getById(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book updateBook(long id, Book book) {
        Book value = bookRepository.findById(id);

        if(value!=null){
            value.setAuthor(book.getAuthor());
            value.setCoverPhotoURL(book.getCoverPhotoURL());
            value.setLanguage(book.getLanguage());
            value.setTitle(book.getTitle());
            value.setPrice(book.getPrice());
            value.setIsbnNumber(book.getIsbnNumber());
            value.setGenre(book.getGenre());
            return bookRepository.save(value);
        }
        else {
            return  null;
        }
    }

}
