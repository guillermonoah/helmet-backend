package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.RubroDao;
import com.portafolio.helmet.entities.Rubro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rubro")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class RubroController {
    @Autowired
    private RubroDao rubroDao ;

    @GetMapping
    public List<Rubro> obtenerRubro(){
        return rubroDao.obtenerRubro();
    }

    @PostMapping
    public Rubro guardarRubro(@RequestBody Rubro rubro){
        return rubroDao.guardarRubro(rubro);
    }
}
