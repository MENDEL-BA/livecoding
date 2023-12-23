package com.lv.project.model;

import jakarta.persistence.*;
import java.util.List;

@Table(name="bibliotheque")
@Entity
public class Bibliotheques {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBibliotheque;
    @Column(name = "nom_bibliotheque")
    private String nomBibliotheque;
    @Column(name = "lieu")
    private String lieu;

    @OneToMany
    @Column(name = "categories")
    private List<Categories> categories;

    @OneToMany
    @Column(name = "books")
    private List<Books> books;
}
