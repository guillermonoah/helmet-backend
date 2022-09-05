package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.GravedadDao;
import com.portafolio.helmet.entities.Gravedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gravedad")
public class GravedadController {

    @Autowired
    private GravedadDao gravedadDao;

    @GetMapping
    public List<Gravedad> obtenerGravedad(){
        return gravedadDao.obtenerGravedad();
    }

    @PostMapping
    public Gravedad guardarGuardar(@RequestBody Gravedad gravedad){
        return gravedadDao.guardarGravedad(gravedad);
    }
}
