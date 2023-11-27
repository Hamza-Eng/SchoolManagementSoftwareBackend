package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.dto.CenterDTO;
import com.gestion.ecole.gestionecole.dto.EstablishmentDTO;
import com.gestion.ecole.gestionecole.entities.Centers;
import com.gestion.ecole.gestionecole.entities.establishments;
import com.gestion.ecole.gestionecole.repositories.CentersRepository;
import com.gestion.ecole.gestionecole.repositories.EtablissmentsRepository;

import jakarta.transaction.Transactional;

/***
 * @author hamza
 * 
 */
@Service
@Transactional
public class EstablishmentService {
	@Autowired
	EtablissmentsRepository repo;
	@Autowired
	CentersRepository centerRepository;

	public EstablishmentDTO saveOrUpdate(EstablishmentDTO establishments) {
		return new EstablishmentDTO(repo.save(EstablishmentDTO.convertFromDtoToEntity(establishments)));

	}

	public Optional<EstablishmentDTO> findById(Long id) {

		return Optional.of(new EstablishmentDTO(repo.findById(id).get()));
	}

	public Optional<EstablishmentDTO> findByCriteria(HashMap<String, String> map) {
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
		try {
			repo.deleteAll();
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

	public List<EstablishmentDTO> findAll() {

		return repo.findAll().stream().map(this::convertToDto).collect(Collectors.toList());

	}

	private EstablishmentDTO convertToDto(establishments Etablissement) {
		EstablishmentDTO dto = new EstablishmentDTO(Etablissement);
		dto.setCentres(centerRepository.findByEtablissements(Etablissement).stream().map(this::convertCenterToDto)
				.collect(Collectors.toList()));
		return dto;
	}

	private CenterDTO convertCenterToDto(Centers center) {
		CenterDTO dto = new CenterDTO(center);
		dto.setEtablissementId(center.getEtablissements().getId());
		return dto;
	}

}
