package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

public class EmployeController implements ControllerGenerator<Employes> {

	@Override
	public Employes saveOrUpdate(Employes t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employes> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Employes> findByCriteria(HashMap<String, String> map) {
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
	public List<Employes> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
