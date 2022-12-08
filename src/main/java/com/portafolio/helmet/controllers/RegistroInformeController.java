package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.RegistroInformeDao;
import com.portafolio.helmet.entities.RegistroInforme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registroinforme")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class RegistroInformeController {
    @Autowired
    private RegistroInformeDao registroInformeDao ;

    @GetMapping
    public List<RegistroInforme> obtenerRegistroInforme(){
        return registroInformeDao.obtenerRegistroInforme();
    }
    @PostMapping
    public RegistroInforme guardarRegistroInforme(@RequestBody RegistroInforme registroInforme){
        return registroInformeDao.guardarRegistroInforme(registroInforme);
    }
}
