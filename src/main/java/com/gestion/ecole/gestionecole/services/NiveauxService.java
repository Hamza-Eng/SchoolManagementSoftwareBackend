package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.entities.Niveaux;
import com.gestion.ecole.gestionecole.repositories.NiveauxRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

@Service
public class NiveauxService implements ServiceGeneratore<Niveaux> {
	@Autowired
	NiveauxRepository repo;

	@Override
	public Niveaux saveOrUpdate(Niveaux niveaux) {
		return repo.save(niveaux);
	}

	@Override
	public Optional<Niveaux> findById(Long id) {

		return repo.findById(id);
	}

	@Override
	public Optional<Niveaux> findByCriteria(HashMap<String, String> map) {
		return Optional.empty();
	}

	@Override
	public Boolean delete(Long id) {
		try {
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
	}

	@Override
	public Boolean deleteAll() {
		return null;
	}

	@Override
	public List<Niveaux> findAll() {
		return repo.findAll();
	}
}
