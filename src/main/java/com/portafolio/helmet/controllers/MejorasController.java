package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.MejorasDao;
import com.portafolio.helmet.entities.Mejoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mejoras")
public class MejorasController {

    @Autowired
    private MejorasDao mejorasDao;

    @GetMapping
    public List<Mejoras> obtenerMejoras(){
        return mejorasDao.obtenerMejoras();}

    @PostMapping
    public Mejoras guardarMejoras(@RequestBody Mejoras mejoras){
        return mejorasDao.guardarMejoras(mejoras);
    }
}
