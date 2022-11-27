package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.EstadoAsesoriaDao;
import com.portafolio.helmet.entities.EstadoAsesoria;
import com.portafolio.helmet.repositories.EstadoAsesoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoAsesoriaService implements EstadoAsesoriaDao {
    @Autowired
    private EstadoAsesoriaRepository estadoAsesoriaRepository;

    @Override
    public List<EstadoAsesoria> obtenerEstadoAsesoria(){
        return (List<EstadoAsesoria>) estadoAsesoriaRepository.findAll();
    }

    @Override
    public EstadoAsesoria guardarEstadoAsesoria(EstadoAsesoria estadoAsesoria){
        return estadoAsesoriaRepository.save(estadoAsesoria);
    }
}

