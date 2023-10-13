package com.gestion.ecole.gestionecole.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Cycles {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private long id;

    private String name;

    private String description;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    private long filiereId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Filieres filieres;
    @OneToMany
    private List<Niveaux> niveauxList;


}
