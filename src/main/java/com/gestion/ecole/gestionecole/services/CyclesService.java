package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.repositories.CyclesRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

/***
 * @author hamza
 * 
 */
@Service
public class CyclesService implements ServiceGeneratore<Cycles> {
	@Autowired
	CyclesRepository repo;

	@Override
	public Cycles saveOrUpdate(Cycles cycles) {

		return repo.save(cycles);
	}

	@Override
	public Optional<Cycles> findById(Long id) {

		return repo.findById(id);
	}

	@Override
	public Optional<Cycles> findByCriteria(HashMap<String, String> map) {

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
	public List<Cycles> findAll() {
		return repo.findAll();
	}
}
