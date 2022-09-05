package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.ProfesionalesDao;
import com.portafolio.helmet.entities.Profesionales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesionales")
public class ProfesionalesController {

    @Autowired
    private ProfesionalesDao profesionalesDao;

    @GetMapping
    public List<Profesionales> obtenerProfesionales(){
        return profesionalesDao.obtenerProfesionales();
    }

    @PostMapping
    public Profesionales guardarProfesionales(@RequestBody Profesionales profesionales){
        return profesionalesDao.guardarProfesionales(profesionales);
    }
}
