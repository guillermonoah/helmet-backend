package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstVisDao;
import com.portafolio.helmet.entities.EstVis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estvis")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class EstVisController {

    @Autowired
    private EstVisDao estVisDao;

    @GetMapping
    public List<EstVis> obtenerEstVis(){return estVisDao.obtenerEstVis();}
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerEstVis(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(estVisDao.obtenerEstVisPorId(id));
    }
   @PostMapping
    public EstVis guardarEstVis(@RequestBody EstVis estVis){
        return estVisDao.guardarEstVis(estVis);
   }
}
