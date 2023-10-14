package com.gestion.ecole.gestionecole.repositories;

import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.entities.Etablissements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissmentsRepository extends JpaRepository<Etablissements,Long> {
}
