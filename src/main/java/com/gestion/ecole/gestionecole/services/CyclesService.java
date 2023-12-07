package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.dto.CycleDTO;
import com.gestion.ecole.gestionecole.dto.FilieresDTO;
import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.entities.Filieres;
import com.gestion.ecole.gestionecole.repositories.CyclesRepository;
import com.gestion.ecole.gestionecole.repositories.FilieresRepository;

/***
 * @author hamza
 * 
 */
@Service
public class CyclesService {
	@Autowired
	CyclesRepository repo;
	@Autowired
	FilieresRepository frepo;

	public Cycles saveOrUpdate(Cycles cycles) {

		return repo.save(cycles);
	}

	public Optional<Cycles> findById(Long id) {

		return repo.findById(id);
	}

	public Optional<Cycles> findByCriteria(HashMap<String, String> map) {

		return Optional.empty();
	}

	public Boolean delete(Long id) {

		try {
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
	}

	public Boolean deleteAll() {
		return null;
	}

	public List<CycleDTO> findAll() {
		
		return repo.findAll().stream().map(this::convertcycleToDto).collect(Collectors.toList());
	}

	private CycleDTO convertcycleToDto(Cycles cycle) {
		CycleDTO dto = new CycleDTO(cycle);
		dto.setFilieres(frepo.findByCycle(cycle).stream().map(this::convertFiliereToDto).collect(Collectors.toList()));
		return dto;
	}

	private FilieresDTO convertFiliereToDto(Filieres filiere) {
		return new FilieresDTO(filiere);

	}
}
