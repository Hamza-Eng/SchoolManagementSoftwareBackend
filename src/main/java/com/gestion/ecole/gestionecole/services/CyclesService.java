package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class CyclesService implements ServiceGeneratore <Cycles> {
    @Override
    public Cycles saveOrUpdate(Cycles cycles) {
        return null;
    }

    @Override
    public Optional<Cycles> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Cycles> findByCriteria(HashMap<String, String> map) {
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
    public List<Cycles> findAll() {
        return null;
    }
}
