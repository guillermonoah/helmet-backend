package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstActividadDao;
import com.portafolio.helmet.entities.EstActividad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estactividad")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class EstActividadController {

    @Autowired
    private EstActividadDao estActividadDao;

    @GetMapping
    public List<EstActividad> obtenerEstActividadDao (){
        return estActividadDao.obtenerEstActividad();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerEstActividad(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(estActividadDao.obtenerEstActividadPorId(id));
    }
    @PostMapping
    public EstActividad guardarEstActividad(@RequestBody EstActividad estActividad){
        return estActividadDao.guardarEstActividad(estActividad);
    }
}
