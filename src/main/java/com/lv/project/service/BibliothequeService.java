package com.lv.project.service;


import com.lv.project.dtos.BibliothequesDTO;
import com.lv.project.model.Bibliotheques;

public interface BibliothequeService {

    Bibliotheques createBibliotheques(BibliothequesDTO books);
    Bibliotheques updateBibliotheques(BibliothequesDTO books);
    Bibliotheques deleteBibliotheques(BibliothequesDTO books);
}
