package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.PagosDao;
import com.portafolio.helmet.entities.Pagos;
import com.portafolio.helmet.repositories.PagosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagosService implements PagosDao {

    @Autowired
    private PagosRepository pagosRepository;

    @Override
    public List<Pagos> obtenerPagos(){return (List<Pagos>) pagosRepository.findAll();}
    @Override
    public Optional<Pagos> obtenerPagosPorId(Long idPagos) {
        Optional<Pagos> pg = pagosRepository.findById(idPagos);
        if(!pg.isPresent()){
            return null;
        }
        return pg;
    }
    @Override
    public Pagos guardarPagos(Pagos pagos){ return pagosRepository.save(pagos);}
}
