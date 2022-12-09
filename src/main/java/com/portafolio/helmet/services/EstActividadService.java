package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.EstActividadDao;
import com.portafolio.helmet.entities.EstActividad;
import com.portafolio.helmet.repositories.EstActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstActividadService implements EstActividadDao {

    @Autowired
    private EstActividadRepository estActividadRepository;

    @Override
    public List<EstActividad> obtenerEstActividad(){
        return (List<EstActividad>) estActividadRepository.findAll();
    }
    @Override
    public Optional<EstActividad> obtenerEstActividadPorId(Long idEstActividad) {
        Optional<EstActividad> ea = estActividadRepository.findById(idEstActividad);
        if(!ea.isPresent()){
            return null;
        }
        return ea;
    }
    @Override
    public EstActividad guardarEstActividad(EstActividad estActividad){
        return estActividadRepository.save(estActividad);
    }
}
