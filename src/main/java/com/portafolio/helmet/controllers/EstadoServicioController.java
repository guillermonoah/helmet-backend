package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EstadoServicioDao;
import com.portafolio.helmet.daos.RubroDao;
import com.portafolio.helmet.entities.Accidente;
import com.portafolio.helmet.entities.EstadoServicio;
import com.portafolio.helmet.entities.Rubro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estadoservicio")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class EstadoServicioController {
    @Autowired
    private EstadoServicioDao estadoServicioDao ;

    @GetMapping
    public List<EstadoServicio> obtenerEstadoServicio(){
        return estadoServicioDao.obtenerEstadoServicio();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerEstadoServicio(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(estadoServicioDao.obtenerEstadoServicioPorId(id));
    }
    @PostMapping
    public EstadoServicio guardarEstadoServicio(@RequestBody EstadoServicio estadoServicio){
        return estadoServicioDao.guardarEstadoServicio(estadoServicio);
    }
}
