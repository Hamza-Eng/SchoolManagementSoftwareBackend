package com.gestion.ecole.gestionecole.repositories;

import com.gestion.ecole.gestionecole.entities.Etablissements;
import com.gestion.ecole.gestionecole.entities.Etudiants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantsRepository extends JpaRepository<Etudiants,Long> {
}
