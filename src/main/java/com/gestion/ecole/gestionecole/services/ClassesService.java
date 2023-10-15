package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.repositories.ClassesRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class ClassesService implements ServiceGeneratore<Classes> {
    @Autowired
    ClassesRepository repo;


    @Override
    public Classes saveOrUpdate(Classes classes) {
        return repo.save(classes);
    }

    @Override
    public Optional<Classes> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Classes> findByCriteria(HashMap<String, String> map) {
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
    public List<Classes> findAll() {
        return repo.findAll();
    }
}
