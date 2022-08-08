    package com.company.book.controller;

import com.company.book.entity.Book;
import com.company.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:8081")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book){

        Book newBook = bookService.saveBook(book);

       return new ResponseEntity<>(newBook,HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public List<Book> getAllBooks(){

      return bookService.getAllBooks();

    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Book> getById(@PathVariable("id") long id){

        Book person= bookService.getById(id);
        if(person!=null){
        return new ResponseEntity<>(person,HttpStatus.OK);
        } else
        { return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<HttpStatus> deleteBookById(@PathVariable("id")long id){

        boolean result = bookService.deleteBook(id);

        if(result){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else {
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/update/{id}")
    public  ResponseEntity<Book> updateBook(@PathVariable("id") long id,
                                            @RequestBody Book book)
    {

        Book updateBook = bookService.updateBook(id,book);

        if(updateBook!=null){
            return new ResponseEntity<>(updateBook,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}

