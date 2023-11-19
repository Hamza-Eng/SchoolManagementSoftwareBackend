package com.gestion.ecole.gestionecole.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.entities.Niveaux;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Long> {
	List<Classes> findByNiveaux(Niveaux niveaux);
}
