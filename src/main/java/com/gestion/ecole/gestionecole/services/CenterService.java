package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Centres;
import com.gestion.ecole.gestionecole.repositories.CentersRepository;
import com.gestion.ecole.gestionecole.utility.ServiceGeneratore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class CenterService implements ServiceGeneratore<Centres> {
    @Autowired
    CentersRepository centersRepository;
    @Override
    public Centres saveOrUpdate(Centres centre) {
        return centersRepository.save(centre);
    }

    @Override
    public Optional<Centres> findById(Long id) {
        return centersRepository.findById(id);
    }

    @Override
    public Optional<Centres> findByCriteria(HashMap<String, String> map) {
        return Optional.empty();
    }

    @Override
    public Boolean delete(Long id) {
        return centersRepository.existsById(id);
    }

    @Override
    public Boolean deleteAll() {
         return null;

    }

    @Override
    public List<Centres> findAll() {
        return centersRepository.findAll();
    }
    //   CentersRepository centersRepository;

//    public CenterService(CentersRepository centersRepository){
//        this.centersRepository=centersRepository;
//    }
//    public List<Centres> findAllCenters(){
//        return  centersRepository.findAll();
//    }
//    public Centres addCenters(Centres centres){
//        return centersRepository.save(centres);
//    }

}
