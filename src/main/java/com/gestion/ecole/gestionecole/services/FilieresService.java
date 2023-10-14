package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.entities.Filieres;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class FilieresService implements ServiceGeneratore <Filieres> {
    @Override
    public Filieres saveOrUpdate(Filieres filieres) {
        return null;
    }

    @Override
    public Optional<Filieres> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Filieres> findByCriteria(HashMap<String, String> map) {
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
    public List<Filieres> findAll() {
        return null;
    }
}
