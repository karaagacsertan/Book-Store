package com.company.book.entity;


import lombok.*;


import javax.persistence.*;
@Entity
@Data
@Table(name="book")
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    private String coverPhotoURL;

    private Long isbnNumber;

    private Double price;

    private String language;

    private String genre;

}