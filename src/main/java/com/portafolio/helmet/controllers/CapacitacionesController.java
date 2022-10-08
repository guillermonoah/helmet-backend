package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.CapacitacionesDao;
import com.portafolio.helmet.entities.Capacitaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/capacitaciones")
public class CapacitacionesController {
    @Autowired
    private CapacitacionesDao capacitacionesDao;

    @GetMapping
    public List<Capacitaciones> obtenerCapacitaciones(){
        return capacitacionesDao.obtenerCapacitaciones();}

    @PostMapping
    public Capacitaciones guardarCapacitaciones(@RequestBody Capacitaciones capacitaciones){
        return capacitacionesDao.guardarCapacitaciones(capacitaciones);}
}
