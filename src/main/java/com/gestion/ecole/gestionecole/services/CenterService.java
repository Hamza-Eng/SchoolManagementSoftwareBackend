package com.gestion.ecole.gestionecole.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.ecole.gestionecole.dto.CenterDTO;
import com.gestion.ecole.gestionecole.dto.CycleDTO;
import com.gestion.ecole.gestionecole.entities.Centers;
import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.repositories.CentersRepository;
import com.gestion.ecole.gestionecole.repositories.CyclesRepository;
import com.gestion.ecole.gestionecole.repositories.EstablishmentRepository;

/***
 * @author hamza
 * 
 */
@Service
public class CenterService {
	@Autowired
	CentersRepository repo;
	@Autowired
	EstablishmentRepository erepo;
	@Autowired
	CyclesRepository crepo;
	 
	public CenterDTO saveOrUpdate(CenterDTO dto) {
		Centers center = CenterDTO.convertFromDTOToEntity(dto);

		center.setEtablissements(erepo.findById(dto.getEtablissementId()).get());

		repo.save(center);

		return dto;
	}

	 
	public Optional<Centers> findById(Long id) {
		return repo.findById(id);
	}

	 
	public Optional<Centers> findByCriteria(HashMap<String, String> map) {
		return Optional.empty();
	}

	 
	public Boolean delete(Long id) {
		try {
			 repo.deleteById(id);
			 return true;
		} catch (Exception e) {
			return false;
		}
	}

	 
	public Boolean deleteAll() {
		return null;

	}

	 


	public List<CenterDTO> findAll() {
		return repo.findAll().stream().map(this::convertCenterToDto).collect(Collectors.toList());
		
	}

	private CenterDTO convertCenterToDto(Centers centre) {
		CenterDTO dto = new CenterDTO(centre);
		dto.setCycles(crepo.findByCentre(centre).stream().map(this::convertCycleToDto).collect(Collectors.toList()));
		return dto;

	}
	private CycleDTO convertCycleToDto(Cycles cycle) {
	CycleDTO dto=new CycleDTO(cycle);
	return dto;

	}

}
