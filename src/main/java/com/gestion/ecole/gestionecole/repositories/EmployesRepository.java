package com.gestion.ecole.gestionecole.repositories;

import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.entities.Niveaux;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployesRepository extends JpaRepository<Employes,Long> {
}
