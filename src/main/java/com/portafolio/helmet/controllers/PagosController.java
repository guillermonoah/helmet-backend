package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.PagosDao;
import com.portafolio.helmet.entities.Pagos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class PagosController {

    @Autowired
    private PagosDao pagosDao;

    @GetMapping
    public List<Pagos> obtenerPagos(){return pagosDao.obtenerPagos();}
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerPagos(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(pagosDao.obtenerPagosPorId(id));
    }
    @PostMapping
    public Pagos guardarPagos(@RequestBody Pagos pagos){return pagosDao.guardarPagos(pagos);}
}
