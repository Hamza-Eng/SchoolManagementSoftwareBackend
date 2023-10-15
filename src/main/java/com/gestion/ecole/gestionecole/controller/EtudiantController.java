package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.ecole.gestionecole.entities.Etudiants;
import com.gestion.ecole.gestionecole.services.EtudiantService;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

@CrossOrigin
@RestController
@RequestMapping("/etudiant")

public class EtudiantController implements ControllerGenerator<Etudiants> {
 
	@Autowired
	EtudiantService service;
	
	@Override
	@PostMapping("/saveOrUpdate")
	public Etudiants saveOrUpdate(@RequestBody Etudiants t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@Override
	@GetMapping("/findById/{id}")
	public Optional<Etudiants> findById(@PathVariable(name = "id") Long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	@Override
	@GetMapping("/findByCriteria")
	public Optional<Etudiants> findByCriteria(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable(name = "id") Long id) {
		// TODO Auto-generated method stub
		return service.delete(id);
	}

	@Override
	@DeleteMapping("/deleteAll")
	public Boolean deleteAll() {
		// TODO Auto-generated method stub
		return service.deleteAll();
	}

	@Override
	@GetMapping("/findAll")
	public List<Etudiants> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

}
