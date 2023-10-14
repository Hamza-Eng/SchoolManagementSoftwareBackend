package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.gestion.ecole.gestionecole.entities.Etudiants;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

public class EtudiantController implements ControllerGenerator<Etudiants> {

	@Override
	public Etudiants saveOrUpdate(Etudiants t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Etudiants> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Etudiants> findByCriteria(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etudiants> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
   
}
