package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstPagoDao;
import com.portafolio.helmet.entities.EstPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estpago")
public class EstPagoController {

    @Autowired
    private EstPagoDao estPagoDao;

    @GetMapping
    public List<EstPago> obtenerEstPago(){return estPagoDao.obtenerEstPago();}

    @PostMapping
    public EstPago guardarEstPago(@RequestBody EstPago estPago){
        return estPagoDao.guardarEstPago(estPago);
    }
}
