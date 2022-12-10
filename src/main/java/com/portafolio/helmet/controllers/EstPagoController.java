package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstPagoDao;
import com.portafolio.helmet.entities.EstPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estpago")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class EstPagoController {

    @Autowired
    private EstPagoDao estPagoDao;

    @GetMapping
    public List<EstPago> obtenerEstPago(){return estPagoDao.obtenerEstPago();}
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerEstPago(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(estPagoDao.obtenerEstPagoId(id));
    }
    @PostMapping
    public EstPago guardarEstPago(@RequestBody EstPago estPago){
        return estPagoDao.guardarEstPago(estPago);
    }
}
