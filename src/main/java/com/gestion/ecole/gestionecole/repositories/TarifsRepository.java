package com.gestion.ecole.gestionecole.repositories;

import com.gestion.ecole.gestionecole.entities.Niveaux;
import com.gestion.ecole.gestionecole.entities.Tarifs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarifsRepository extends JpaRepository<Tarifs,Long> {
}
