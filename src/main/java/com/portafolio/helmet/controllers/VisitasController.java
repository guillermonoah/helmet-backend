package com.portafolio.helmet.controllers;


import com.portafolio.helmet.daos.VisitasDao;
import com.portafolio.helmet.entities.Visitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitas")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class VisitasController {


    @Autowired
    private VisitasDao visitasDao;


    @GetMapping
    public List<Visitas> obtenerVisitas(){return visitasDao.obtenerVisitas(); }

    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerVisitas(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(visitasDao.obtenerVisitasPorId(id));
    }
    @PostMapping
    public Visitas guardarVisitas(@RequestBody Visitas visitas){
        return visitasDao.guardarVisitas(visitas);
    }
}
