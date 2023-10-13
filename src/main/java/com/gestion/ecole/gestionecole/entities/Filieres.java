package com.gestion.ecole.gestionecole.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Filieres {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "nomfiliere")
    private String nomfiliere;
    @Basic
    @Column(name = "intitule")
    private String intitule;
    @Basic
    @Column(name = "anneetude")
    private int anneetude;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    private  Centres centres;
    @OneToMany(mappedBy = "filieres")
    private List<Cycles> cyclesList;


}
