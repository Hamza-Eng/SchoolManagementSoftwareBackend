package com.gestion.ecole.gestionecole.repositories;

import com.gestion.ecole.gestionecole.entities.Centres;
import com.gestion.ecole.gestionecole.entities.Cycles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CyclesRepository extends JpaRepository<Cycles,Long> {
}
