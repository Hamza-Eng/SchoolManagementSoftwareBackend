package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.entities.Filieres;
import com.gestion.ecole.gestionecole.repositories.FilieresRepository;

/***
 * @author hamza
 * 
 */
@Service
public class FilieresService {
	@Autowired
	FilieresRepository repo;

	public Filieres saveOrUpdate(Filieres filieres) {

		return repo.save(filieres);
	}

	public Optional<Filieres> findById(Long id) {
		return repo.findById(id);
	}

	public Optional<Filieres> findByCriteria(HashMap<String, String> map) {
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

	public List<Filieres> findAll() {
		return repo.findAll();
	}
}
