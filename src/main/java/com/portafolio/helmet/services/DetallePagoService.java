package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.DetallePagoDao;
import com.portafolio.helmet.entities.DetallePago;
import com.portafolio.helmet.repositories.DetallePagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePagoService  implements DetallePagoDao {
    @Autowired
    private DetallePagoRepository detallePagoRepository;
    @Override
    public List<DetallePago> obtenerDetallePago(){
        return (List<DetallePago>) detallePagoRepository.findAll();
    }
    @Override
    public DetallePago guardarDetallePago(DetallePago detallePago){
        return detallePagoRepository.save(detallePago);
    }

}
