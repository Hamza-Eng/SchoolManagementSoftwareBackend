package com.gestion.ecole.gestionecole.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.utility.ControllerGenerator;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/employe")

public class EmployeController implements ControllerGenerator<Employes> {

	@PostMapping("/saveorupdate")
	@Override
	public Employes saveOrUpdate(Employes t) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/fingbyid{id} ")
	@Override
	public Optional<Employes> findById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
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
		return null;
	}

	@DeleteMapping("/deleteall")
	@Override
	public Boolean deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/findall")
	@Override
	public List<Employes> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
