package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.EstadoADao;
import com.portafolio.helmet.entities.EstadoA;
import com.portafolio.helmet.repositories.EstadoARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoAService implements EstadoADao {

    @Autowired
    private EstadoARepository estadoARepository;

    @Override
    public List<EstadoA> obtenerEstadoA(){
        return (List<EstadoA>) estadoARepository.findAll();
    }

    @Override
    public EstadoA guardarEstadoA(EstadoA estadoA){
        return estadoARepository.save(estadoA);
    }
}
