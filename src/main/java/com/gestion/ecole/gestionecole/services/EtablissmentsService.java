package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Etablissements;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class EtablissmentsService implements ServiceGeneratore <Etablissements> {
    @Override
    public Etablissements saveOrUpdate(Etablissements etablissements) {
        return null;
    }

    @Override
    public Optional<Etablissements> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Etablissements> findByCriteria(HashMap<String, String> map) {
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
    public List<Etablissements> findAll() {
        return null;
    }
}
