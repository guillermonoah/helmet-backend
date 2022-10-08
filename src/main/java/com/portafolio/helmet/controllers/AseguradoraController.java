package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.AseguradoraDao;
import com.portafolio.helmet.entities.Aseguradora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aseguradora")
public class AseguradoraController {


    @Autowired
    private AseguradoraDao aseguradoraDao;


    @GetMapping
    public List<Aseguradora> obtenerAseguradora(){
        return aseguradoraDao.obtenerAseguradora();
    }

    @PostMapping
    public Aseguradora guardarAseguradora(@RequestBody Aseguradora aseguradora){
        return aseguradoraDao.guardarAseguradora(aseguradora);
    }
}
