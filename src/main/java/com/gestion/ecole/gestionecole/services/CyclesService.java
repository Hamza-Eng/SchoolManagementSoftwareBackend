package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.repositories.CyclesRepository;

/***
 * @author hamza
 * 
 */
@Service
public class CyclesService {
	@Autowired
	CyclesRepository repo;

	public Cycles saveOrUpdate(Cycles cycles) {

		return repo.save(cycles);
	}

	public Optional<Cycles> findById(Long id) {

		return repo.findById(id);
	}

	public Optional<Cycles> findByCriteria(HashMap<String, String> map) {

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

	public List<Cycles> findAll() {
		return repo.findAll();
	}
}
