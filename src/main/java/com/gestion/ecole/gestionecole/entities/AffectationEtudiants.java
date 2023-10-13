package com.gestion.ecole.gestionecole.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity

@Data
@AllArgsConstructor @NoArgsConstructor

public class AffectationEtudiants {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private long id;

    private String droit;

    private BigDecimal montant;

    private String transport;

    private int prixtran;

    private BigDecimal assurance;

    private long etudiantId;

    private long anneeunvId;

    private long centreId;

    private long cycleId;

    private long niveauId;

    private long classId;

    private long userId;

    private Timestamp createdAt;

    private Timestamp updatedAt;


}
