package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.RegistroReporteDao;
import com.portafolio.helmet.entities.RegistroReporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registroreporte")
public class RegistroReporteController {
    @Autowired
    private RegistroReporteDao registroReporteDao ;

    @GetMapping
    public List<RegistroReporte> obtenerRegistroReporte(){
        return registroReporteDao.obtenerRegistroReporte();
    }
    @PostMapping
    public RegistroReporte guardarRegistroReporte(@RequestBody RegistroReporte registroReporte){
        return registroReporteDao.guardarRegistroReporte(registroReporte);
    }
}
