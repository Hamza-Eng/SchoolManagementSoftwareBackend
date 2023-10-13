package com.gestion.ecole.gestionecole.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Classes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private long id;

    private String nom;

    private String numero;

    private Timestamp createdAt;

    private Timestamp updatedAt;
    @ManyToOne(fetch = FetchType.LAZY)
    private Niveaux niveaux;


}
