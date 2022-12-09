package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.EstPagoDao;
import com.portafolio.helmet.entities.EstPago;
import com.portafolio.helmet.repositories.EstPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstPagoService implements EstPagoDao {
    @Autowired
    private EstPagoRepository estPagoRepository;

    @Override
    public List<EstPago> obtenerEstPago(){return (List<EstPago>) estPagoRepository.findAll();}
    @Override
    public Optional<EstPago> obtenerEstPagoId(Long idEstPago) {
        Optional<EstPago> ep = estPagoRepository.findById(idEstPago);
        if(!ep.isPresent()){
            return null;
        }
        return ep;
    }
    @Override
    public EstPago guardarEstPago(EstPago estPago){return estPagoRepository.save(estPago);}
}
