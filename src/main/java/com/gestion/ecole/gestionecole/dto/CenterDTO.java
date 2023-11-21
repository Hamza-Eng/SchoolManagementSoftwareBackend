package com.gestion.ecole.gestionecole.dto;

import java.util.Date;
import java.util.List;

import com.gestion.ecole.gestionecole.entities.Centers;

import lombok.Data;

@Data
public class CenterDTO {
	public Centers convertDtoToEntity(CenterDTO dto) {
		
		Centers center=new Centers();
		
		center.setAdresse(dto.getAdresse());
		center.setContent(dto.getContent());
		center.setId(dto.getId());
		center.setEmail(dto.getEmail());
		center.setCreatedAt(dto.getCreatedAt());
		center.setNomcentre(dto.getNomcentre());
		center.setTel(dto.getTel());
		center.setUpdatedAt(dto.getUpdatedAt());

		return center;

	}
	public CenterDTO(Centers centre) {
		super();
		this.id = centre.getId();
		this.nomcentre = centre.getNomcentre();
		this.adresse = centre.getAdresse();
		this.email = centre.getEmail();
		this.tel = centre.getTel();
		this.content = centre.getContent();
		this.etablissementId = centre.getEtablissements().getId();
//		this.cycles =centre.getCycles();
		this.createdAt = centre.getCreatedAt();
		this.updatedAt = centre.getUpdatedAt();
	}

	private Long id;

	private String nomcentre;

	private String adresse;

	private String email;

	private String tel;

	private String content;

	private Long etablissementId;

	private List<CycleDTO> cycles;

	private Date createdAt;

	private Date updatedAt;

}
