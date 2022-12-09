package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.ServicioDao;
import com.portafolio.helmet.entities.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicios")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class ServicioController {
    @Autowired
    private ServicioDao servicioDao;

    @GetMapping
    public List<Servicio> obtenerServicios(){

        return servicioDao.obtenerServicios();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerServicio(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(servicioDao.obtenerServicioPorId(id));
    }
    @PostMapping
    public Servicio guardarServicio(@RequestBody Servicio servicio){

        return servicioDao.guardarServicio(servicio);
    }

}
