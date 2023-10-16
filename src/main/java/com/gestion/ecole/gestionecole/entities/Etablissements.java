package com.gestion.ecole.gestionecole.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Etablissements {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	private String logo;

	private String societe;

	private String adresse;

	private String ville;

	private String email;

	private String descc;

	private String web;

	private String ice;

	private String rc;

	private String patente;

	private String cnss;

	private String ifs;

	private String tel;

	private String portable;

	private String banque;

	private String agence;

	private String rib;

	private String image;

	private long userId;
	
	@OneToMany(mappedBy = "etablissements")
	private List<Centres> centres;

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
