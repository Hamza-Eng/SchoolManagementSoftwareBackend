package com.gestion.ecole.gestionecole.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.entities.Filieres;

@Repository
public interface FilieresRepository extends JpaRepository<Filieres, Long> {
	List<Filieres> findByCycle(Cycles cycles);
}
