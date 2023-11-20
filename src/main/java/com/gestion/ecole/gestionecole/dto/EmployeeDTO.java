package com.gestion.ecole.gestionecole.dto;

import java.util.Date;

import com.gestion.ecole.gestionecole.entities.Employes;

import lombok.Data;

@Data
public class EmployeeDTO {
	public Employes toEntity(EmployeeDTO dto){
		Employes employes = new Employes();
		employes.setId(dto.getId());
		employes.setCv(dto.getCv());
		employes.setEmail(dto.getEmail());
		employes.setCentreId(dto.getCentreId());
		employes.setAdresse(dto.getAdresse());
		employes.setCin(dto.getCin());
		employes.setDiplome(dto.getDiplome());
		employes.setAnneeunvId(dto.getAnneeunvId());
		employes.setDatenaissance(dto.getDatenaissance());
		employes.setExperience(dto.getExperience());
		employes.setNiveau(dto.getNiveau());
		employes.setVille(dto.getVille());
		employes.setPhoto(dto.getPhoto());
		employes.setNom(dto.getNom());
		employes.setPrenom(dto.getPrenom());
		employes.setSexe(dto.getSexe());
		employes.setSalaire(dto.getSalaire());
		employes.setStatus(dto.getStatus());
		employes.setTel(dto.getTel());
		employes.setTypecontrat(dto.getTypecontrat());
		employes.setUserId(dto.getUserId());
		employes.setCreatedAt(dto.getCreatedAt());
		employes.setUpdatedAt(dto.getUpdatedAt());
		employes.setPortable(dto.getPortable());

		return  employes;
	}

	public EmployeeDTO(Employes employes) {
		super();
		this.id = employes.getId();
		this.type = employes.getType();
		this.nom = employes.getNom();
		this.prenom = employes.getPrenom();
		this.cin = employes.getCin();
		this.ville = employes.getVille();
		this.sexe = employes.getSexe();
		this.datenaissance = employes.getDatenaissance();
		this.adresse = employes.getAdresse();
		this.email = employes.getEmail();
		this.tel = employes.getTel();
		this.portable = employes.getPortable();
		this.diplome = employes.getDiplome();
		this.niveau = employes.getNiveau();
		this.poste = employes.getPoste();
		this.experience = employes.getExperience();
		this.salaire = employes.getSalaire();
		this.typecontrat = employes.getTypecontrat();
		this.cv = employes.getCv();
		this.photo = employes.getPhoto();
		this.status = employes.getStatus();
		this.anneeunvId = employes.getAnneeunvId();
		this.centreId = employes.getCentreId();
		this.userId = employes.getUserId();
		this.createdAt = employes.getCreatedAt();
		this.updatedAt = employes.getUpdatedAt();
	}

	private long id;

	private String type;

	private String nom;

	private String prenom;

	private String cin;

	private String ville;

	private String sexe;

	private Date datenaissance;

	private String adresse;

	private String email;

	private String tel;

	private String portable;

	private String diplome;

	private String niveau;

	private String poste;

	private String experience;

	private Integer salaire;

	private String typecontrat;

	private String cv;

	private String photo;

	private Integer status;

	private Long anneeunvId;

	private Long centreId;

	private Long userId;

	private Date createdAt;

	private Date updatedAt;

}
