package com.gestion.ecole.gestionecole.dto;

import java.util.Date;
import java.util.List;

import com.gestion.ecole.gestionecole.entities.Centres;

import lombok.Data;

@Data
public class CenterDTO {
	public Centres convertDtoToEntity(CenterDTO dto) {
		
		Centres center=new Centres();
		
		center.setAdresse(dto.getAdresse());
		center.setContent(dto.getContent());
		
		return center;

	}
	public CenterDTO(Centres centre) {
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
