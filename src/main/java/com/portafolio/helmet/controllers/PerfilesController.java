package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.PerfilesDao;
import com.portafolio.helmet.entities.Perfiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/perfiles")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class PerfilesController {

    @Autowired
    private PerfilesDao perfilesDao;

    @GetMapping
    public List<Perfiles> obtenerPerfiles(){
        return perfilesDao.obtenerPerfiles();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerPerfiles(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(perfilesDao.obtenerPerfilesPorId(id));
    }
    @PostMapping
    public Perfiles guardarPerfiles(@RequestBody Perfiles perfiles){
        return perfilesDao.guardarPerfiles(perfiles);
    }
}
