package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gestion.ecole.gestionecole.dto.ClasseDTO;
import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.services.ClassesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/class")

public class ClassController {

	@Autowired
	ClassesService service;

	@PostMapping("/saveOrUpdate")
	public ClasseDTO saveOrUpdate(@RequestBody ClasseDTO t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<Optional<Classes>> findById(@PathVariable(name = "id") Long id) {

		return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
	}

	@GetMapping("/findByCriteria")
	public Optional<Classes> findByCriteria(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable(name = "id") Long id) {
		// TODO Auto-generated method stub
		return service.delete(id);
	}

	@DeleteMapping("/deleteAll")
	public Boolean deleteAll() {
		// TODO Auto-generated method stub
		return service.deleteAll();
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<ClasseDTO>> findAll() throws JsonProcessingException {

		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}

}
