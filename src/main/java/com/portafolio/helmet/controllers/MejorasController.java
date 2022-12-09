package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.MejorasDao;
import com.portafolio.helmet.entities.Mejoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mejoras")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class MejorasController {

    @Autowired
    private MejorasDao mejorasDao;

    @GetMapping
    public List<Mejoras> obtenerMejoras(){
        return mejorasDao.obtenerMejoras();}
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerMejoras(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(mejorasDao.obtenerMejorasPorId(id));
    }
    @PostMapping
    public Mejoras guardarMejoras(@RequestBody Mejoras mejoras){
        return mejorasDao.guardarMejoras(mejoras);
    }
}
