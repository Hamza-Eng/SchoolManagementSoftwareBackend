package com.gestion.ecole.gestionecole.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Etablissements {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

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

    private Date createdAt;

    private Date updatedAt;
    @OneToMany(mappedBy = "etablissements")
    private List<Centres> centres;


}
