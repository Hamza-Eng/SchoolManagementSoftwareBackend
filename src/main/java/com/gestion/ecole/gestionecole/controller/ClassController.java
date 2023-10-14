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

import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

@CrossOrigin
@RestController
@RequestMapping("/class")

public class ClassController implements ControllerGenerator<Classes> {

	@Override
	@PostMapping("/saveOrUpdate")
	public Classes saveOrUpdate(@RequestBody Classes t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/findById/{id}")
	public Optional<Classes> findById(@PathVariable(name = "id") Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	@GetMapping("/findByCriteria")
	public Optional<Classes> findByCriteria(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable(name = "id") Long id) {
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
	public List<Classes> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
