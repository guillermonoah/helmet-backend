package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.PerfilesDao;
import com.portafolio.helmet.entities.Perfiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/perfiles")
public class PerfilesController {

    @Autowired
    private PerfilesDao perfilesDao;

    @GetMapping
    public List<Perfiles> obtenerPerfiles(){
        return perfilesDao.obtenerPerfiles();
    }

    @PostMapping
    public Perfiles guardarPerfiles(@RequestBody Perfiles perfiles){
        return perfilesDao.guardarPerfiles(perfiles);
    }
}
