package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.ecole.gestionecole.entities.Etablissements;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

@RestController
@RequestMapping("/etablissement")
@CrossOrigin
public class EtablissementController implements ControllerGenerator<Etablissements>{

	@Override
	@PostMapping("/saveorupdate")
	public Etablissements saveOrUpdate(Etablissements t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("findById/{id}")
	public Optional<Etablissements> findById(@PathVariable(name="id") Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Etablissements> findByCriteria(HashMap<String, String> map) {
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
	public List<Etablissements> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
