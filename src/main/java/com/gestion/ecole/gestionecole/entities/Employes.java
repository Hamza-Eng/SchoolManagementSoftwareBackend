package com.gestion.ecole.gestionecole.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
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

    private Timestamp createdAt;

    private Timestamp updatedAt;


}
