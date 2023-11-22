package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.entities.Etudiants;
import com.gestion.ecole.gestionecole.repositories.EtudiantsRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

@Service
public class EtudiantService {
	@Autowired
	EtudiantsRepository repo;

	 
	public Etudiants saveOrUpdate(Etudiants etudiants) {

		return repo.save(etudiants);
	}

	 
	public Optional<Etudiants> findById(Long id) {

		return repo.findById(id);
	}

	 
	public Optional<Etudiants> findByCriteria(HashMap<String, String> map) {
		return Optional.empty();
	}

	 
	public Boolean delete(Long id) {

		try {
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
	}

	 
	public Boolean deleteAll() {
		return null;
	}

	 
	public List<Etudiants> findAll() {

		return repo.findAll();
	}
}
