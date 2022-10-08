package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstActividadDao;
import com.portafolio.helmet.entities.EstActividad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estactividad")
public class EstActividadController {

    @Autowired
    private EstActividadDao estActividadDao;

    @GetMapping
    public List<EstActividad> obtenerEstActividadDao (){
        return estActividadDao.obtenerEstActividad();
    }

    @PostMapping
    public EstActividad guardarEstActividad(@RequestBody EstActividad estActividad){
        return estActividadDao.guardarEstActividad(estActividad);
    }
}
