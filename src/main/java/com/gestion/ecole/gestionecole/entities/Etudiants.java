package com.gestion.ecole.gestionecole.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiants {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id

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

	@ManyToOne
	@JoinColumn(name = "classe_id")
	@JsonIgnore
	private Classes classe;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	// constructors, getters, and setters

	// You can use lifecycle callback methods to update these timestamps
	@PrePersist
	protected void onCreate() {
		createdAt = new Date();
		updatedAt = createdAt;
	}

	@PreUpdate
	protected void onUpdate() {
		updatedAt = new Date();
	}

}
