package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class EmployeService implements ServiceGeneratore <Employes> {
    @Override
    public Employes saveOrUpdate(Employes employes) {
        return null;
    }

    @Override
    public Optional<Employes> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Employes> findByCriteria(HashMap<String, String> map) {
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
    public List<Employes> findAll() {
        return null;
    }
}
