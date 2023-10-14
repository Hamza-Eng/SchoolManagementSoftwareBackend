package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

public class CycleController implements ControllerGenerator<Cycles> {

	@Override
	@PostMapping("/saveOrUpdate")
	public Cycles saveOrUpdate(Cycles t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/findById/{id}")
	public Optional<Cycles> findById(@PathVariable(name = "id") Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	@GetMapping("/findByCriteria")
	public Optional<Cycles> findByCriteria(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable(name = "id")Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@DeleteMapping("/deleteAll")
	public Boolean deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/findAll")
	public List<Cycles> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
