package com.gestion.ecole.gestionecole.dto;

import java.util.Date;
import java.util.List;

import com.gestion.ecole.gestionecole.entities.Filieres;
import com.gestion.ecole.gestionecole.entities.Niveaux;

import lombok.Data;

@Data
public class NiveauxDTO {
	
	public NiveauxDTO(Niveaux niveaux) {
		super();
		this.id = niveaux.getId();
		this.filiere = niveaux.getFiliere();
//		this.classes = niveaux.getClasses();
		this.createdAt = niveaux.getCreatedAt();
		this.updatedAt = niveaux.getUpdatedAt();
	}

	private long id;

	private Filieres filiere;

	private List<ClasseDTO> classes;

	private Date createdAt;

	private Date updatedAt;
}
