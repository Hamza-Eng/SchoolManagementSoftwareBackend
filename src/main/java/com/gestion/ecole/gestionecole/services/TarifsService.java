package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Tarifs;
import com.gestion.ecole.gestionecole.repositories.TarifsRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class TarifsService implements ServiceGeneratore <Tarifs> {
    @Autowired
    TarifsRepository repo;
    @Override
    public Tarifs saveOrUpdate(Tarifs tarifs) {
        return repo.save(tarifs);
    }

    @Override
    public Optional<Tarifs> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Tarifs> findByCriteria(HashMap<String, String> map) {
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
    public List<Tarifs> findAll() {
        return repo.findAll();
    }
}
