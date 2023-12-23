package com.lv.project.repositories;

import com.lv.project.model.Bibliotheques;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotheRepository extends JpaRepository<Bibliotheques, Long> {
}
