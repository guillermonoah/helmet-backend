package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.DetallePagoDao;
import com.portafolio.helmet.entities.DetallePago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallepago")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class DetallePagoController {
    @Autowired
    private DetallePagoDao detallePagoDao ;

    @GetMapping
    public List<DetallePago> obtenerDetallePago(){
        return detallePagoDao.obtenerDetallePago();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerAccidentePorId(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(detallePagoDao.obteneridDetallePagoPorId(id));
    }
    @PostMapping
    public DetallePago guardarDetallePago(@RequestBody DetallePago detallePago){
        return detallePagoDao.guardarDetallePago(detallePago);
    }
}
