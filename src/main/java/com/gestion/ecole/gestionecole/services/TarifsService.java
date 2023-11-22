package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.entities.Tarifs;
import com.gestion.ecole.gestionecole.repositories.TarifsRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

@Service
public class TarifsService {
	@Autowired
	TarifsRepository repo;

	 
	public Tarifs saveOrUpdate(Tarifs tarifs) {
		return repo.save(tarifs);
	}

	 
	public Optional<Tarifs> findById(Long id) {
		return repo.findById(id);
	}

	 
	public Optional<Tarifs> findByCriteria(HashMap<String, String> map) {
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

	 
	public List<Tarifs> findAll() {
		return repo.findAll();
	}
}
