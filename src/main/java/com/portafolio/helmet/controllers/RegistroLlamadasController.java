package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.RegistroLlamadasDao;
import com.portafolio.helmet.entities.RegistroLlamadas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrollamadas")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class RegistroLlamadasController {
    @Autowired
    private RegistroLlamadasDao registroLlamadasDao ;

    @GetMapping
    public List<RegistroLlamadas> obtenerRegistroLlamadas(){
        return registroLlamadasDao.obtenerRegistroLlamadas();
    }
    @PostMapping
    public RegistroLlamadas guardarRegistroLlamadas(@RequestBody RegistroLlamadas registroLlamadas){
        return registroLlamadasDao.guardarRegistroLlamadas(registroLlamadas);
    }
}
