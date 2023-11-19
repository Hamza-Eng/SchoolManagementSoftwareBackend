package com.gestion.ecole.gestionecole.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.ecole.gestionecole.entities.Centres;
import com.gestion.ecole.gestionecole.entities.establishments;

@Repository
public interface CentersRepository extends JpaRepository<Centres, Long> {
	List<Centres> findByEtablissements(establishments Etablissement);
}
