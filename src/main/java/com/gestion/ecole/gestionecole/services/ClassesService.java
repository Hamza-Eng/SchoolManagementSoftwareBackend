package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.dto.ClasseDTO;
import com.gestion.ecole.gestionecole.dto.EtudiantDTO;
import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.entities.Etudiants;
import com.gestion.ecole.gestionecole.repositories.ClassesRepository;
import com.gestion.ecole.gestionecole.repositories.EtudiantsRepository;
import com.gestion.ecole.gestionecole.repositories.NiveauxRepository;

@Service
public class ClassesService {
	@Autowired
	ClassesRepository repo;
	@Autowired
	NiveauxRepository nrepo;

	@Autowired
	EtudiantsRepository erepo;

	public ClasseDTO saveOrUpdate(ClasseDTO dto) {
		Classes classes = ClasseDTO.dtoentity(dto);
		classes.setNiveaux(nrepo.findById(dto.getNiveauxId()).get());



		repo.save(classes);
		return dto;

	}

	public Optional<Classes> findById(Long id) {
		return repo.findById(id);
	}

	public Optional<Classes> findByCriteria(HashMap<String, String> map) {
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

	public List<ClasseDTO> findAll() {

		return repo.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
	}

	private ClasseDTO convertToDto(Classes classe) {

		ClasseDTO dto = new ClasseDTO(classe);
		dto.setEtudiants(
				erepo.findByClasse(classe).stream().map(this::convertEtudianToDto).collect(Collectors.toList()));
		return dto;

	}

	private EtudiantDTO convertEtudianToDto(Etudiants etudiant) {
		return new EtudiantDTO(etudiant);

	}

}
