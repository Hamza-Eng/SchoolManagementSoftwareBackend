package com.gestion.ecole.gestionecole.entities;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Employes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

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
