package com.gestion.ecole.gestionecole.services;

import com.gestion.ecole.gestionecole.entities.Centres;
import com.gestion.ecole.gestionecole.repositories.CentersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CenterService {
    CentersRepository centersRepository;

    public CenterService(CentersRepository centersRepository){
        this.centersRepository=centersRepository;
    }
    public List<Centres> findAllCenters(){
        return  centersRepository.findAll();
    }
    public Centres addCenters(Centres centres){
        return centersRepository.save(centres);
    }

}
