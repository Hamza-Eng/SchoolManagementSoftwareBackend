package com.gestion.ecole.gestionecole.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.ecole.gestionecole.entities.Filieres;

@Repository
public interface FilieresRepository extends JpaRepository<Filieres, Long> {
}
