package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.entities.Niveaux;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class NiveauxService implements ServiceGeneratore <Niveaux> {
    @Override
    public Niveaux saveOrUpdate(Niveaux niveaux) {
        return null;
    }

    @Override
    public Optional<Niveaux> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Niveaux> findByCriteria(HashMap<String, String> map) {
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
    public List<Niveaux> findAll() {
        return null;
    }
}
