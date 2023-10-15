package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Etudiants;
import com.gestion.ecole.gestionecole.repositories.EtablissmentsRepository;
import com.gestion.ecole.gestionecole.repositories.EtudiantsRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
@Service
public class EtudiantService implements ServiceGeneratore <Etudiants> {
    @Autowired
    EtudiantsRepository repo;
    @Override
    public Etudiants saveOrUpdate(Etudiants etudiants) {

        return repo.save(etudiants);
    }

    @Override
    public Optional<Etudiants> findById(Long id) {

        return repo.findById(id);
    }

    @Override
    public Optional<Etudiants> findByCriteria(HashMap<String, String> map) {
        return Optional.empty();
    }

    @Override
    public Boolean delete(Long id) {

        try {
            repo.deleteById(id);
            return  true;
        } catch (Exception e){
            e.getMessage();
            return  false;
        }
    }

    @Override
    public Boolean deleteAll() {
        return null;
    }

    @Override
    public List<Etudiants> findAll() {

        return repo.findAll();
    }
}
