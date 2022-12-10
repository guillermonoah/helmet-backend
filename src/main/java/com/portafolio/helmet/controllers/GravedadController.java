package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.GravedadDao;
import com.portafolio.helmet.entities.Gravedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gravedad")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class GravedadController {

    @Autowired
    private GravedadDao gravedadDao;

    @GetMapping
    public List<Gravedad> obtenerGravedad(){
        return gravedadDao.obtenerGravedad();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerGravedad(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(gravedadDao.obtenerGravedadPorId(id));
    }
    @PostMapping
    public Gravedad guardarGuardar(@RequestBody Gravedad gravedad){
        return gravedadDao.guardarGravedad(gravedad);
    }
}
