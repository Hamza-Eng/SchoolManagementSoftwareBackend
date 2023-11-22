package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.repositories.ClassesRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

@Service
public class ClassesService {
	@Autowired
	ClassesRepository repo;

	 
	public Classes saveOrUpdate(Classes classes) {
		return repo.save(classes);
	}

	 
	public Optional<Classes> findById(Long id) {
		return repo.findById(id);
	}

	 
	public Optional<Classes> findByCriteria(HashMap<String, String> map) {
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

	 
	public List<Classes> findAll() {
		return repo.findAll();
	}

}
