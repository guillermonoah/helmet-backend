package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.EstadoServicioDao;
import com.portafolio.helmet.entities.EstadoServicio;
import com.portafolio.helmet.repositories.EstadoServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoServicioService implements EstadoServicioDao {
    @Autowired
    private EstadoServicioRepository estadoServicioRepository;
    @Override
    public List<EstadoServicio> obtenerEstadoServicio(){
        return (List<EstadoServicio>) estadoServicioRepository.findAll();
    }
    @Override
    public EstadoServicio guardarEstadoServicio(EstadoServicio estadoServicio){
        return estadoServicioRepository.save(estadoServicio);
    }
}
