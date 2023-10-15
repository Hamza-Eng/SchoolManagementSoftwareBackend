package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Filieres;
import com.gestion.ecole.gestionecole.repositories.FilieresRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class FilieresService implements ServiceGeneratore <Filieres> {
    @Autowired
    FilieresRepository repo;
    @Override
    public Filieres saveOrUpdate(Filieres filieres) {

        return repo.save(filieres);
    }

    @Override
    public Optional<Filieres> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Filieres> findByCriteria(HashMap<String, String> map) {
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
    public List<Filieres> findAll() {
        return repo.findAll();
    }
}
