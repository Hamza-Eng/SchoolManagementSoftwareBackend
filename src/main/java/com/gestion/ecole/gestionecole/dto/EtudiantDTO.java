package com.gestion.ecole.gestionecole.dto;

import java.util.Date;

import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.entities.Etudiants;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtudiantDTO {

	public EtudiantDTO(Etudiants etudiant) {
		super();
		this.id = etudiant.getId();
		this.numero = etudiant.getNumero();
		this.nom = etudiant.getNom();
		this.prenom = etudiant.getPrenom();
		this.sexe = etudiant.getSexe();
		this.datenaissance = etudiant.getDatenaissance();
		this.nationalite = etudiant.getNationalite();
		this.oriente = etudiant.getOriente();
		this.adresse = etudiant.getAdresse();
		this.reduction = etudiant.getReduction();
		this.maladie = etudiant.getMaladie();
		this.nompere = etudiant.getNompere();
		this.nommere = etudiant.getNommere();
		this.contactpri = etudiant.getContactpri();
		this.contactsec = etudiant.getContactsec();
		this.email = etudiant.getEmail();
		this.cantine = etudiant.getCantine();
		this.photo = etudiant.getPhoto();
		this.descc = etudiant.getDescc();
		this.userId = etudiant.getUserId();
		this.classe = etudiant.getClasse();
		this.createdAt = etudiant.getCreatedAt();
		this.updatedAt = etudiant.getUpdatedAt();
	}

	private Long id;

	private String numero;

	private String nom;

	private String prenom;

	private String sexe;

	private Date datenaissance;

	private String nationalite;

	private String oriente;

	private String adresse;

	private Integer reduction;

	private String maladie;

	private String nompere;

	private String nommere;

	private Integer contactpri;

	private Integer contactsec;

	private String email;

	private String cantine;

	private String photo;

	private String descc;

	private long userId;

	private Classes classe;

	private Date createdAt;

	private Date updatedAt;
}
