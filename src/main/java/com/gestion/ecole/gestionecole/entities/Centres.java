package com.gestion.ecole.gestionecole.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.Mapping;

import java.sql.Timestamp;
import java.text.Format;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Centres {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id

	private Long id;

	private String nomcentre;

	private String adresse;

	private String email;

	private String tel;

	private String content;
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")

	@ManyToOne(fetch = FetchType.LAZY)
	private Etablissements etablissements;
	@OneToMany(mappedBy = "centres")
	private List<Filieres> filieresList;
	
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
