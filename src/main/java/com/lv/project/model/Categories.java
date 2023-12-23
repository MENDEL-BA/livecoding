package com.lv.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "categorie")
@Data
@Entity
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorie;

    @Column(name = "nomCategorie")
    private String nomCategorie;

    @OneToOne
    private Books books;
}
