package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.ecole.gestionecole.entities.Niveaux;
import com.gestion.ecole.gestionecole.services.NiveauxService;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/niveau")
public class NiveauController implements ControllerGenerator<Niveaux> {

	@Autowired
	NiveauxService service;

	@PostMapping("/saveorupdate")
	@Override
	public Niveaux saveOrUpdate(@RequestBody Niveaux t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@GetMapping("/findbyid{id} ")
	@Override
	public Optional<Niveaux> findById(Long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	@GetMapping("/findbycriteria")
	@Override
	public Optional<Niveaux> findByCriteria(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@DeleteMapping("/delete{id}")
	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		return service.delete(id);
	}

	@DeleteMapping("/deleteall")
	@Override
	public Boolean deleteAll() {
		// TODO Auto-generated method stub
		return service.deleteAll();
	}

	@GetMapping("/findall")
	@Override
	public List<Niveaux> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

}
