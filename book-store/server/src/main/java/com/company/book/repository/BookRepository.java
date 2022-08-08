package com.company.book.repository;

import com.company.book.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
Book findById(long personId);


}
