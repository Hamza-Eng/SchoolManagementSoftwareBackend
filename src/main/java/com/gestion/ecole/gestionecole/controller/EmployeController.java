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

import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.services.EmployeService;

@CrossOrigin
@RestController
@RequestMapping("/employe")

public class EmployeController {
	@Autowired
	EmployeService service;

	@PostMapping("/saveorupdate")

	public Employes saveOrUpdate(@RequestBody Employes t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@GetMapping("/fingbyid{id} ")

	public Optional<Employes> findById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	@GetMapping("/findbycriteria")

	public Optional<Employes> findByCriteria(HashMap<String, String> map) {
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

	@GetMapping("/findall")

	public List<Employes> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

}
