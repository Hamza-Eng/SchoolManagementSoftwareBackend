package com.gestion.ecole.gestionecole.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.ecole.gestionecole.entities.Employes;

@Repository
public interface EmployesRepository extends JpaRepository<Employes, Long> {
}
