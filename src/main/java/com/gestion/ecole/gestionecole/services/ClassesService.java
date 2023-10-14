package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ClassesService implements ServiceGeneratore<Classes> {
    @Override
    public Classes saveOrUpdate(Classes classes) {
        return null;
    }

    @Override
    public Optional<Classes> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Classes> findByCriteria(HashMap<String, String> map) {
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
    public List<Classes> findAll() {
        return null;
    }
}
