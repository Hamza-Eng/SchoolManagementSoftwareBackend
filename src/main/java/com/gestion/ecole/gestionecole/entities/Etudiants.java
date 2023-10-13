package com.gestion.ecole.gestionecole.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
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

    private Date createdAt;

    private Date updatedAt;


}
