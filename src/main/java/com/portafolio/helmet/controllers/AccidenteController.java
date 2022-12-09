package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.AccidenteDao;
import com.portafolio.helmet.dtos.AccidenteDto;
import com.portafolio.helmet.entities.Accidente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accidente")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class AccidenteController {

    @Autowired
    private AccidenteDao accidenteDao;

    @GetMapping
    public List<Accidente> obtenerAccidente(){
        return accidenteDao.obtenerAccidente();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerAccidente(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(accidenteDao.obtenerAccidentePorId(id));
    }
    @PostMapping
    public Accidente guardarAccidente(@RequestBody Accidente accidente){
        return accidenteDao.guardarAccidente(accidente);
    }
    @PutMapping("/{idAccidente}/{idGravedad}")
    public ResponseEntity<?> actualizarAccidentePorId(@PathVariable Long idAccidente, @PathVariable Long idGravedad, @RequestBody AccidenteDto accidenteDto){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(accidenteDao.actualizarAccidentePorId(idAccidente, idGravedad, accidenteDto));
    }
}
