package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.ServicioDao;
import com.portafolio.helmet.entities.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicios")
public class ServicioController {
    @Autowired
    private ServicioDao servicioDao;

    @GetMapping
    public List<Servicio> obtenerServicios(){

        return servicioDao.obtenerServicios();
    }

    @PostMapping
    public Servicio guardarServicio(@RequestBody Servicio servicio){

        return servicioDao.guardarServicio(servicio);
    }

}
