package com.lv.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "books")
@Data
@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;

    @Column(name = "title")
    private  String title;


    @Column(name = "author")
    private String author;
    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

}
