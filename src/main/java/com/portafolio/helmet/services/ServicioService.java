package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.ServicioDao;
import com.portafolio.helmet.entities.Servicio;
import com.portafolio.helmet.repositories.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ServicioService implements ServicioDao {

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> obtenerServicios() {
        return (List<Servicio>) servicioRepository.findAll();
    }
    @Override
    public Optional<Servicio> obtenerServicioPorId(Long idServicio) {
        Optional<Servicio> sr = servicioRepository.findById(idServicio);
        if(!sr.isPresent()){
            return null;
        }
        return sr;
    }
    @Override
    public Servicio guardarServicio(Servicio servicio) {
        return servicioRepository.save(servicio);
    }
}
