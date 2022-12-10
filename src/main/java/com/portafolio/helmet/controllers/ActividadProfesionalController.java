package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.ActividadProfesionalDao;
import com.portafolio.helmet.entities.ActividadProfesional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actividadprofesional")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class ActividadProfesionalController {

    @Autowired
    private ActividadProfesionalDao actividadProfesionalDao;

    @GetMapping
    public List<ActividadProfesional> obtenerActividadProfesional(){
        return actividadProfesionalDao.obtenerActividadProfesional();
    }

    @PostMapping
    public ActividadProfesional guardarActividadProfesional(@RequestBody ActividadProfesional actividadProfesional){
        return actividadProfesionalDao.guardarActividadProfesional(actividadProfesional);
    }
}
