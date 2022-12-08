package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.MultasDao;
import com.portafolio.helmet.entities.Multas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/multas")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class MultasController {
    @Autowired
    private MultasDao multasDao ;

    @GetMapping
    public List<Multas> obtenerMultas(){
        return multasDao.obtenerMultas();
    }
    @PostMapping
    public Multas guardarMultas(@RequestBody Multas multas){
        return multasDao.guardarMultas(multas);
    }
}
