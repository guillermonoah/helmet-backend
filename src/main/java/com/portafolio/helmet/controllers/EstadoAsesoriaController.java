package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstadoAsesoriaDao;
import com.portafolio.helmet.entities.EstadoAsesoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estadoasesoria")
public class EstadoAsesoriaController {
    @Autowired
    private EstadoAsesoriaDao estadoAsesoriaDao;

    @GetMapping
    public List<EstadoAsesoria> obtenerEstadoAsesoria(){
        return estadoAsesoriaDao.obtenerEstadoAsesoria();
    }

    @PostMapping
    public EstadoAsesoria guardarEstadoAsesoria(@RequestBody EstadoAsesoria estadoAsesoria){
        return estadoAsesoriaDao.guardarEstadoAsesoria(estadoAsesoria);
    }
}
