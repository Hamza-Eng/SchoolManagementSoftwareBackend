package com.gestion.ecole.gestionecole.controller;

import com.gestion.ecole.gestionecole.entities.Centres;
import com.gestion.ecole.gestionecole.services.CenterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/center")
public class CenterController {
    private  final CenterService centerService;

    public CenterController(CenterService centerService) {
        this.centerService = centerService;
    }

    @GetMapping("/getcenters")
    public ResponseEntity<List<Centres>> getAllCenters(){
        List<Centres> centres = centerService.findAllCenters();
        return new ResponseEntity<>(centres, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Centres> addCenters(@RequestBody Centres centre){
        Centres centres = centerService.addCenters(centre);
        return new ResponseEntity<>(centres, HttpStatus.CREATED);
    }


}
