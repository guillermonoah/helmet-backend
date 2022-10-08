package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstVisDao;
import com.portafolio.helmet.entities.EstVis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estvis")
public class EstVisController {

    @Autowired
    private EstVisDao estVisDao;

    @GetMapping
    public List<EstVis> obtenerEstVis(){return estVisDao.obtenerEstVis();}

   @PostMapping
    public EstVis guardarEstVis(@RequestBody EstVis estVis){
        return estVisDao.guardarEstVis(estVis);
   }
}
