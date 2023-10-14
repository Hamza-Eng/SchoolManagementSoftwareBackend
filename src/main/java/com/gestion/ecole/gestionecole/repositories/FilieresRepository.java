package com.gestion.ecole.gestionecole.repositories;

import com.gestion.ecole.gestionecole.entities.Filieres;
import com.gestion.ecole.gestionecole.entities.Niveaux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilieresRepository extends JpaRepository<Filieres,Long> {
}
