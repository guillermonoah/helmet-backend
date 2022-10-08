package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.PagosDao;
import com.portafolio.helmet.entities.Pagos;
import com.portafolio.helmet.repositories.PagosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagosService implements PagosDao {

    @Autowired
    private PagosRepository pagosRepository;

    @Override
    public List<Pagos> obtenerPagos(){return (List<Pagos>) pagosRepository.findAll();}

    @Override
    public Pagos guardarPagos(Pagos pagos){ return pagosRepository.save(pagos);}
}
