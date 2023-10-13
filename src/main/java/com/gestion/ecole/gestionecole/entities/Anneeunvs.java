package com.gestion.ecole.gestionecole.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor

public class Anneeunvs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private long id;

    private String anneeunv;

    private Timestamp createdAt;

    private Timestamp updatedAt;


}
