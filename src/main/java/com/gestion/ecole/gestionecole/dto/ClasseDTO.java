package com.gestion.ecole.gestionecole.dto;

import java.util.Date;
import java.util.List;

import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.entities.Niveaux;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClasseDTO {
	public static Classes dtoentity(ClasseDTO dto) {
		Classes classes = new Classes();
		//classes.setNiveaux(new Niveaux());
		classes.setId(dto.getId());
		classes.setNom(dto.getNom());
		classes.setAnneeUniver(dto.getAnneeUniver());
		classes.setNumero(dto.getNumero());
		classes.setCreatedAt(dto.getCreatedAt());
		classes.setUpdatedAt(dto.getUpdatedAt());
		return classes;
	}

	public ClasseDTO(Classes classe) {

		this.id = classe.getId();
		this.nom = classe.getNom();
		this.numero = classe.getNumero();
		this.anneeUniver = classe.getAnneeUniver();
		this.niveauxId = classe.getNiveaux().getId();
		this.niveauxName = classe.getNiveaux().getName();
		this.createdAt = classe.getCreatedAt();
		this.updatedAt = classe.getUpdatedAt();
	}

	private long id;

	private String nom;

	private String numero;

	private Date anneeUniver;

	private Long niveauxId;

	private String niveauxName;

	private List<EtudiantDTO> etudiants;

	private Date createdAt;

	private Date updatedAt;
	// constructors, getters, and setters

}
