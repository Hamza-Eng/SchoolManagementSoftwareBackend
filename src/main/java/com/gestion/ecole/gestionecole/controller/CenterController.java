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

import com.gestion.ecole.gestionecole.dto.CenterDTO;
import com.gestion.ecole.gestionecole.entities.Centers;
import com.gestion.ecole.gestionecole.services.CenterService;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;

@CrossOrigin
@RestController
@RequestMapping("/center")
public class CenterController {
	@Autowired
	CenterService service;

	 
	@PostMapping("/saveOrUpdate")
	public CenterDTO saveOrUpdate(@RequestBody CenterDTO center) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(center);
	}

	 
	@GetMapping("/findById/{id}")
	public Optional<Centers> findById(@PathVariable(name = "id") Long id) {

		return service.findById(id);
	}

	 
	@GetMapping("/findByCriteria")
	public Optional<Centers> findByCriteria(@RequestBody HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	 
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable(name = "id") Long id) {
		// TODO Auto-generated method stub
		return service.delete(id);
	}

	 
	public Boolean deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	 


	@GetMapping("/findAll")
	public List<CenterDTO> findAll() {

		return service.findAll();
	}
}
