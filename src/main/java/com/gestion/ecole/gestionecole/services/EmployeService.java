package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.repositories.EmployesRepository;

@Service
public class EmployeService {
	EmployesRepository repo;

	public Employes saveOrUpdate(Employes employes) {

		return repo.save(employes);
	}

	public Optional<Employes> findById(Long id) {

		return repo.findById(id);
	}

	public Optional<Employes> findByCriteria(HashMap<String, String> map) {
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

	public List<Employes> findAll() {

		return repo.findAll();
	}
}
