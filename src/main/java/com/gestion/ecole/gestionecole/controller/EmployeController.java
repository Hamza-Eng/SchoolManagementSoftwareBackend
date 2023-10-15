package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.services.EmployeService;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/employe")

public class EmployeController implements ControllerGenerator<Employes> {
	@Autowired
	EmployeService service;

	@PostMapping("/saveorupdate")
	@Override
	public Employes saveOrUpdate(@RequestBody Employes t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@GetMapping("/fingbyid{id} ")
	@Override
	public Optional<Employes> findById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	@GetMapping("/findbycriteria")
	@Override
	public Optional<Employes> findByCriteria(HashMap<String, String> map) {
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
	public List<Employes> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

}
