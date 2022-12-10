package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstadoAsesoriaDao;
import com.portafolio.helmet.entities.EstadoAsesoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estadoasesoria")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class EstadoAsesoriaController {
    @Autowired
    private EstadoAsesoriaDao estadoAsesoriaDao ;

    @GetMapping
    public List<EstadoAsesoria> obtenerEstadoAsesoria(){
        return estadoAsesoriaDao.obtenerEstadoAsesoria();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerEstadoAsesoria(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(estadoAsesoriaDao.obtenerEstadoAsesoriaPorId(id));
    }
    @PostMapping
    public EstadoAsesoria guardarEstadoAsesoria(@RequestBody EstadoAsesoria estadoAsesoria){
        return estadoAsesoriaDao.guardarEstadoAsesoria(estadoAsesoria);
    }
}
