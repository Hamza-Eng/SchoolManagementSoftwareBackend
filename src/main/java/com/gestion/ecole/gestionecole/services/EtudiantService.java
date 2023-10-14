package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Etudiants;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class EtudiantService implements ServiceGeneratore <Etudiants> {
    @Override
    public Etudiants saveOrUpdate(Etudiants etudiants) {
        return null;
    }

    @Override
    public Optional<Etudiants> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Etudiants> findByCriteria(HashMap<String, String> map) {
        return Optional.empty();
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public Boolean deleteAll() {
        return null;
    }

    @Override
    public List<Etudiants> findAll() {
        return null;
    }
}
