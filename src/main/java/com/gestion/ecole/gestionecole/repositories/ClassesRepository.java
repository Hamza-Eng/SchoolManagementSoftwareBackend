package com.gestion.ecole.gestionecole.repositories;

import com.gestion.ecole.gestionecole.entities.Centres;
import com.gestion.ecole.gestionecole.entities.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Classes,Long> {
}
