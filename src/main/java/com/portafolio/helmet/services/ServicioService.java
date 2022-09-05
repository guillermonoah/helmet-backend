package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.ServicioDao;
import com.portafolio.helmet.entities.Servicio;
import com.portafolio.helmet.repositories.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServicioService implements ServicioDao {

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> obtenerServicios() {
        return (List<Servicio>) servicioRepository.findAll();
    }

    @Override
    public Servicio guardarServicio(Servicio servicio) {
        return servicioRepository.save(servicio);
    }
}
