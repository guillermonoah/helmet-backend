package com.portafolio.helmet.controllers;


import com.portafolio.helmet.daos.VisitasDao;
import com.portafolio.helmet.entities.Visitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitas")
public class VisitasController {


    @Autowired
    private VisitasDao visitasDao;


    @GetMapping
    public List<Visitas> obtenerVisitas(){return visitasDao.obtenerVisitas(); }


    @PostMapping
    public Visitas guardarVisitas(@RequestBody Visitas visitas){
        return visitasDao.guardarVisitas(visitas);
    }
}
