package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.AsesoriaDao;
import com.portafolio.helmet.entities.Asesoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asesoria")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})

public class AsesoriaController {
    @Autowired
    private AsesoriaDao asesoriaDao;

    @GetMapping
    public List<Asesoria> obtenerAsesoria(){
        return asesoriaDao.obtenerAsesoria();}

    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerAsesoria(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(asesoriaDao.obtenerAsesoriaPorId(id));
    }
    @PostMapping
    public Asesoria guardarAsesoria(@RequestBody Asesoria asesoria){
        return asesoriaDao.guardarAsesoria(asesoria);
    }
}
