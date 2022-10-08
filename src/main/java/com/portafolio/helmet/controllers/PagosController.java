package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.PagosDao;
import com.portafolio.helmet.entities.Pagos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
public class PagosController {

    @Autowired
    private PagosDao pagosDao;

    @GetMapping
    public List<Pagos> obtenerPagos(){return pagosDao.obtenerPagos();}

    @PostMapping
    public Pagos guardarPagos(@RequestBody Pagos pagos){return pagosDao.guardarPagos(pagos);}
}
