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

import com.gestion.ecole.gestionecole.dto.NiveauxDTO;
import com.gestion.ecole.gestionecole.entities.Niveaux;
import com.gestion.ecole.gestionecole.services.NiveauxService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/niveau")
public class NiveauController {

	@Autowired
	NiveauxService service;

	@PostMapping("/saveorupdate")

	public Niveaux saveOrUpdate(@RequestBody Niveaux t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@GetMapping("/findbyid{id} ")

	public Optional<Niveaux> findById(Long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	@GetMapping("/findbycriteria")

	public Optional<Niveaux> findByCriteria(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@DeleteMapping("/delete{id}")

	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		return service.delete(id);
	}

	@DeleteMapping("/deleteall")

	public Boolean deleteAll() {
		// TODO Auto-generated method stub
		return service.deleteAll();
	}

	@GetMapping("/findAll")
	public List<NiveauxDTO> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

}
