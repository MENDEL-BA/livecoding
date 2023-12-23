package com.lv.project.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

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
    private Set<Categories> categories;

    @OneToMany
    @Column(name = "books")
    private List<Books> books;
    public Bibliotheques(String nomBibliotheque, String lieu, Set<Categories> categories, List<Books> books) {
        this.nomBibliotheque = nomBibliotheque;
        this.lieu = lieu;
        this.categories = categories;
        this.books = books;
    }


    public Bibliotheques() {

    }
}
