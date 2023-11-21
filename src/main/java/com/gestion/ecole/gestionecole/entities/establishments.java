package com.gestion.ecole.gestionecole.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class establishments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	private String logo;

	private String name;

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

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "etablissements", cascade = CascadeType.ALL)
	private List<Centers> centres;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
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
