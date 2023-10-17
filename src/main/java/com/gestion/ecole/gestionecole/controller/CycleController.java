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

import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.services.CyclesService;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

@CrossOrigin
@RestController
@RequestMapping("/cycle")

public class CycleController implements ControllerGenerator<Cycles> {
	@Autowired
	CyclesService service;

	@Override
	@PostMapping("/saveOrUpdate")
	public Cycles saveOrUpdate(@RequestBody Cycles t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@Override
	@GetMapping("/findById/{id}")
	public Optional<Cycles> findById(@PathVariable(name = "id") Long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	@Override
	@GetMapping("/findByCriteria")
	public Optional<Cycles> findByCriteria(HashMap<String, String> map) {
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
	public List<Cycles> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

}