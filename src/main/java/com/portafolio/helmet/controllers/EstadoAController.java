package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstadoADao;
import com.portafolio.helmet.entities.EstadoA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estadoa")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class EstadoAController {


    @Autowired
    private EstadoADao estadoADao;

    @GetMapping
    public List<EstadoA> obtenerA(@RequestBody EstadoA estadoA){
        return estadoADao.obtenerEstadoA();
    }
    @PostMapping
    public EstadoA guardarEstadoA(@RequestBody EstadoA estadoA){
        return estadoADao.guardarEstadoA(estadoA);
    }
}
