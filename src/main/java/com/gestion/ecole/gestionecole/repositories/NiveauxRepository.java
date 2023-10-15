package com.gestion.ecole.gestionecole.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.ecole.gestionecole.entities.Niveaux;

@Repository
public interface NiveauxRepository extends JpaRepository<Niveaux, Long> {
}
