package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.AccidenteDao;
import com.portafolio.helmet.entities.Accidente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accidente")
public class AccidenteController {

    @Autowired
    private AccidenteDao accidenteDao;

    @GetMapping
    public List<Accidente> obtenerAccidente(){
        return accidenteDao.obtenerAccidente();
    }

    @PostMapping
    public Accidente guardarAccidente(@RequestBody Accidente accidente){
        return accidenteDao.guardarAccidente(accidente);
    }
}
