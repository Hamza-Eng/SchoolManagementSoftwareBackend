package com.gestion.ecole.gestionecole.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class Classes {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id

	private long id;

	private String nom;

	private String numero;

	private Date anneeUniver;

	@ManyToOne
	@JoinColumn(name = "niveaux_id")
	private Niveaux niveaux;
	
	@OneToMany(mappedBy = "classe")
	private List<Etudiants> etudiants;

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
