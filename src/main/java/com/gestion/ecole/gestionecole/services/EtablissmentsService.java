package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Etablissements;
import com.gestion.ecole.gestionecole.repositories.EtablissmentsRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
@Service
public class EtablissmentsService implements ServiceGeneratore <Etablissements> {
    @Autowired
    EtablissmentsRepository repo;
    @Override
    public Etablissements saveOrUpdate(Etablissements etablissements) {

        return repo.save(etablissements);
    }

    @Override
    public Optional<Etablissements> findById(Long id) {

        return repo.findById(id);
    }

    @Override
    public Optional<Etablissements> findByCriteria(HashMap<String, String> map) {
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
    public List<Etablissements> findAll() {

        return repo.findAll();
    }
}
