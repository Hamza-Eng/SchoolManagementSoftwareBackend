package com.gestion.ecole.gestionecole.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class Classes{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3070272023916667889L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id

	private long id;

	private String nom;

	private String numero;

	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date anneeUniver;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "niveaux_id")
	@JsonIgnore
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
