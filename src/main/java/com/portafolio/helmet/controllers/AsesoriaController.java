package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.AsesoriaDao;
import com.portafolio.helmet.entities.Asesoria;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping
    public Asesoria guardarAsesoria(@RequestBody Asesoria asesoria){
        return asesoriaDao.guardarAsesoria(asesoria);
    }
}
