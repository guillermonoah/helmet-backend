package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.RegistroReporteDao;
import com.portafolio.helmet.entities.RegistroReporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/registroreporte")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class RegistroReporteController {
    @Autowired
    private RegistroReporteDao registroReporteDao ;

    @GetMapping
    public List<RegistroReporte> obtenerRegistroReporte(){
        return registroReporteDao.obtenerRegistroReporte();
    }
    @PostMapping
    public RegistroReporte guardarRegistroReporte(@RequestBody RegistroReporte registroReporte){
        return registroReporteDao.guardarRegistroReporte(registroReporte);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.registroReporteDao.eliminarPorId(id);
        if (ok){
            return "Se elimino el regitro con id: "+ id;
        }else{
            return "No se pudo eliminar el regitro con id: "+ id;
        }
    }


    /*
    @PutMapping("/{id}")
    public RegistroReporte editarRegistroReporte(@RequestBody RegistroReporte registroReporte,@PathVariable Long id){
        Optional<RegistroReporte> o = service.porId(id);
        if (o.isPresent()){
            RegistroReporte rp = o.get();
            rp.setNombreRep(registroReporte.getNombreRep());
            return ResposeEntity.status(HttpStatus.CREATED).body(service.guardar(rp));
        }
        return ResposeEntity.notFound().build();
    }*/
}
