package com.gestion.ecole.gestionecole.dto;

import java.util.Date;
import java.util.List;

import com.gestion.ecole.gestionecole.entities.Classes;

import lombok.Data;

@Data
public class ClasseDTO {

	public ClasseDTO(Classes classe) {
		super();
		this.id = classe.getId();
		this.nom = classe.getNom();
		this.numero = classe.getNumero();
		this.anneeUniver = classe.getAnneeUniver();
		this.niveauxId = classe.getNiveaux().getId();
//		this.etudiants =classe.getEtudiants();
		this.createdAt = classe.getCreatedAt();
		this.updatedAt = classe.getUpdatedAt();
	}

	private long id;

	private String nom;

	private String numero;

	private Date anneeUniver;

	private Long niveauxId;

	private List<EtudiantDTO> etudiants;

	private Date createdAt;

	private Date updatedAt;
	// constructors, getters, and setters

}
