package com.lv.project.service.serviceImpl;

import com.lv.project.dtos.BibliothequesDTO;
import com.lv.project.model.Bibliotheques;
import com.lv.project.model.Books;
import com.lv.project.model.Categories;
import com.lv.project.repositories.BibliotheRepository;
import com.lv.project.repositories.BookRepository;
import com.lv.project.repositories.CategorieRepository;
import com.lv.project.service.BibliothequeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BibliothequesServiceImpl implements BibliothequeService {

    private final BibliotheRepository bibliotheRepository;
    private final CategorieRepository categorieRepository;
    private final BookRepository bookRepository;

    public BibliothequesServiceImpl(BibliotheRepository bibliotheRepository, CategorieRepository categorieRepository, BookRepository bookRepository) {
        this.bibliotheRepository = bibliotheRepository;
        this.categorieRepository = categorieRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public Bibliotheques createBibliotheques(BibliothequesDTO bibliothequesDTO) {

        Set<Categories> categories = (Set<Categories>) categorieRepository.getReferenceById(bibliothequesDTO.getCategorieId());
        List<Books> books = (List<Books>) bookRepository.getReferenceById(bibliothequesDTO.getBooksId());

        Bibliotheques bibliotheques = new Bibliotheques(
                bibliothequesDTO.getNomBibliotheque(),
                bibliothequesDTO.getLieu(),
                null,
                null
        );
        return bibliotheRepository.save(bibliotheques);
    }

    @Override
    public Bibliotheques updateBibliotheques(BibliothequesDTO bibliothequesDTO) {
        Bibliotheques bibliotheques ;
        Set<Categories> categories = null;
        List<Books> books = null;

        if(bibliothequesDTO.getIdBibliotheque()!=null)
             bibliotheques = bibliotheRepository.getReferenceById(bibliothequesDTO.getIdBibliotheque());

        if(bibliothequesDTO.getCategorieId()!=null)
            categories = (Set<Categories>) categorieRepository.getReferenceById(bibliothequesDTO.getCategorieId());

        if(bibliothequesDTO.getBooksId()!=null)
             books = (List<Books>) bookRepository.getReferenceById(bibliothequesDTO.getBooksId());

        bibliotheques = new Bibliotheques(
                bibliothequesDTO.getNomBibliotheque() !=  null ? bibliothequesDTO.getNomBibliotheque() : "",
                bibliothequesDTO.getLieu() !=  null ? bibliothequesDTO.getLieu() : "",
                categories,
                books
        );
        return bibliotheRepository.save(bibliotheques);
    }

    @Override
    public Bibliotheques deleteBibliotheques(BibliothequesDTO booksDto) {
        return null;
    }
}
