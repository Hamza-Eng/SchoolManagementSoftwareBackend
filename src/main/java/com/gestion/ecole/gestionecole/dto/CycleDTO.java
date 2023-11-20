package com.gestion.ecole.gestionecole.dto;

import java.util.Date;
import java.util.List;

import com.gestion.ecole.gestionecole.entities.Cycles;

import lombok.Data;

@Data
public class CycleDTO {

	public CycleDTO(Cycles cycles) {
		super();
		this.id = cycles.getId();
		this.name = cycles.getName();
		this.description = cycles.getDescription();
		this.centreId = cycles.getCentre().getId();
//		this.filieres =cycles.getFilieres();
		this.createdAt = cycles.getCreatedAt();
		this.updatedAt = cycles.getUpdatedAt();
	}

	private long id;

	private String name;

	private String description;

	private Long centreId;

	private List<FilieresDTO> filieres;

	private Date createdAt;

	private Date updatedAt;

}
