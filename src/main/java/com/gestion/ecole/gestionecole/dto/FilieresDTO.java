package com.gestion.ecole.gestionecole.dto;

import java.util.Date;
import java.util.List;

import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.entities.Filieres;

import lombok.Data;

@Data
public class FilieresDTO {

	public FilieresDTO(Filieres filiere) {
		super();
		this.id = filiere.getId();
		this.nomfiliere = filiere.getNomfiliere();
		this.intitule = filiere.getIntitule();
		this.anneetude = filiere.getAnneetude();
		this.description = filiere.getDescription();
		this.cycle = filiere.getCycle();
//		this.niveauxs =filiere.getNiveauxs();
		this.createdAt = filiere.getCreatedAt();
		this.updatedAt = filiere.getUpdatedAt();
	}

	private long id;

	private String nomfiliere;

	private String intitule;

	private int anneetude;

	private String description;

	private Cycles cycle;

	private List<NiveauxDTO> niveauxs;

	private Date createdAt;

	private Date updatedAt;

}