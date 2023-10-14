package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

public class ClassController implements ControllerGenerator<Classes>{

	@Override
	public Classes saveOrUpdate(Classes t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Classes> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Classes> findByCriteria(HashMap<String, String> map) {
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
	public List<Classes> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
