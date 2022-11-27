package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstadoServicioDao;
import com.portafolio.helmet.daos.RubroDao;
import com.portafolio.helmet.entities.EstadoServicio;
import com.portafolio.helmet.entities.Rubro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estadoservicio")
public class EstadoServicioController {
    @Autowired
    private EstadoServicioDao estadoServicioDao ;

    @GetMapping
    public List<EstadoServicio> obtenerEstadoServicio(){
        return estadoServicioDao.obtenerEstadoServicio();
    }

    @PostMapping
    public EstadoServicio guardarEstadoServicio(@RequestBody EstadoServicio estadoServicio){
        return estadoServicioDao.guardarEstadoServicio(estadoServicio);
    }
}
