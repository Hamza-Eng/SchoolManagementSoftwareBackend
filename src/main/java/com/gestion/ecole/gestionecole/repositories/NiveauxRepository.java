package com.gestion.ecole.gestionecole.repositories;

import com.gestion.ecole.gestionecole.entities.Etudiants;
import com.gestion.ecole.gestionecole.entities.Niveaux;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NiveauxRepository extends JpaRepository<Niveaux,Long> {
}
