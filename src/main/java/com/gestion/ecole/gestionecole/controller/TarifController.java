package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.ecole.gestionecole.entities.Tarifs;

@CrossOrigin
@RestController
@RequestMapping("/Tarif")

public class TarifController  {

	 
	@PostMapping("/saveOrUpdate")
	public Tarifs saveOrUpdate(@RequestBody Tarifs t) {
		// TODO Auto-generated method stub
		return null;
	}

	 
	@GetMapping("/findById/{id}")
	public Optional<Tarifs> findById(@PathVariable(name = "id") Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	 
	@GetMapping("/findByCriteria")
	public Optional<Tarifs> findByCriteria(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	 
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable(name = "id") Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	 
	@DeleteMapping("/deleteAll")
	public Boolean deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	 
	@GetMapping("/findAll")
	public List<Tarifs> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
