package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.RegistroAccidentesDao;
import com.portafolio.helmet.entities.RegistroAccidentes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registroaccidentes")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class RegistroAccidentesController {


    @Autowired
    private RegistroAccidentesDao registroAccidentesDao;

    @GetMapping
    public List<RegistroAccidentes> obtenerRegistro(){
        return registroAccidentesDao.obtenerRegistroAccidentes();
    }

    @PostMapping
    public RegistroAccidentes guardarRegistroAccidentes(@RequestBody RegistroAccidentes registroAccidentes){
        return registroAccidentesDao.guardarRegistroAccidentes(registroAccidentes);
    }
}
