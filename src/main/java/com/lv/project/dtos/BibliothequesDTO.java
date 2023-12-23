package com.lv.project.dtos;

import lombok.Data;

@Data
public class BibliothequesDTO {

    private Long idBibliotheque;

    private String nomBibliotheque;

    private String lieu;

    private Long categorieId;

    private Long booksId;
}
