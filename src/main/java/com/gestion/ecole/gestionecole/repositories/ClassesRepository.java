package com.gestion.ecole.gestionecole.repositories;

import com.gestion.ecole.gestionecole.entities.Centres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepository extends JpaRepository<Centres,Long> {
}
