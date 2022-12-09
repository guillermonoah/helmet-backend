package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.CapacitacionesDao;
import com.portafolio.helmet.entities.Capacitaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/capacitaciones")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class CapacitacionesController {
    @Autowired
    private CapacitacionesDao capacitacionesDao;

    @GetMapping
    public List<Capacitaciones> obtenerCapacitaciones(){
        return capacitacionesDao.obtenerCapacitaciones();}
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerCapacitaciones(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(capacitacionesDao.obtenerCapacitacionesPorId(id));
    }
    @PostMapping
    public Capacitaciones guardarCapacitaciones(@RequestBody Capacitaciones capacitaciones){
        return capacitacionesDao.guardarCapacitaciones(capacitaciones);}
}
