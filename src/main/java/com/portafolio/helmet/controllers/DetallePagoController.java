package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.DetallePagoDao;
import com.portafolio.helmet.entities.DetallePago;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping
    public DetallePago guardarDetallePago(@RequestBody DetallePago detallePago){
        return detallePagoDao.guardarDetallePago(detallePago);
    }
}
