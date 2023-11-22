package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.dto.CenterDTO;
import com.gestion.ecole.gestionecole.dto.EstablishmentDTO;
import com.gestion.ecole.gestionecole.entities.Centers;
import com.gestion.ecole.gestionecole.entities.establishments;
import com.gestion.ecole.gestionecole.repositories.CentersRepository;
import com.gestion.ecole.gestionecole.repositories.EtablissmentsRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

import jakarta.transaction.Transactional;

/***
 * @author hamza
 * 
 */
@Service
@Transactional
public class EtablissmentsService {
	@Autowired
	EtablissmentsRepository repo;
	@Autowired
	CentersRepository centerRepository;

	public establishments saveOrUpdate(establishments establishments) {

		return repo.save(establishments);
	}

	public Optional<establishments> findById(Long id) {

		return repo.findById(id);
	}

	public Optional<establishments> findByCriteria(HashMap<String, String> map) {
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

	public List<EstablishmentDTO> findAllV2() {

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

	public List<establishments> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
