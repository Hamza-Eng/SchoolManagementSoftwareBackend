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

import com.gestion.ecole.gestionecole.dto.EstablishmentDTO;
import com.gestion.ecole.gestionecole.entities.establishments;
import com.gestion.ecole.gestionecole.services.EtablissmentsService;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

@RestController
@RequestMapping("/etablissement")
@CrossOrigin
public class EtablissementController {

	@Autowired
	EtablissmentsService service;

	 
	@PostMapping("/saveorupdate")
	public establishments saveOrUpdate(@RequestBody establishments t) {
		// TODO Auto-generated method stub
		System.out.println("=========§§§§§§§========>< " + t.toString());
		return service.saveOrUpdate(t);
	}

	 
	@GetMapping("/findById/{id}")
	public Optional<establishments> findById(@PathVariable(name = "id") Long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	 
	@GetMapping("/findByCriteria")
	public Optional<establishments> findByCriteria(@RequestBody HashMap<String, String> map) {
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

	 
//	@GetMapping("/findAll")
	public List<establishments> findAll() {
		return null;
	}

	@GetMapping("/findAll")
	private List<EstablishmentDTO> findAllV() {
		return service.findAllV2();

	}

}
