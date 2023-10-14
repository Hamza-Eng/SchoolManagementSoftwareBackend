package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Tarifs;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class TarifsService implements ServiceGeneratore <Tarifs> {
    @Override
    public Tarifs saveOrUpdate(Tarifs tarifs) {
        return null;
    }

    @Override
    public Optional<Tarifs> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Tarifs> findByCriteria(HashMap<String, String> map) {
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
    public List<Tarifs> findAll() {
        return null;
    }
}
