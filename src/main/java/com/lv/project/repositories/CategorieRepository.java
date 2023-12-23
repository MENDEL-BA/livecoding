package com.lv.project.repositories;
import com.lv.project.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository  extends JpaRepository<Categories, Long> {
}
