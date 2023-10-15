package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.repositories.EmployesRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeService implements ServiceGeneratore <Employes> {
    EmployesRepository repo;
    @Override
    public Employes saveOrUpdate(Employes employes) {

        return repo.save(employes);
    }

    @Override
    public Optional<Employes> findById(Long id) {

        return repo.findById(id);
    }

    @Override
    public Optional<Employes> findByCriteria(HashMap<String, String> map) {
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
    public List<Employes> findAll() {

        return repo.findAll();
    }
}
