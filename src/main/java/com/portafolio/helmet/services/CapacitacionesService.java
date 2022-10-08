package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.CapacitacionesDao;
import com.portafolio.helmet.entities.Capacitaciones;
import com.portafolio.helmet.repositories.CapacitacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapacitacionesService implements CapacitacionesDao {

    @Autowired
    private CapacitacionesRepository capacitacionesRepository;

    @Override
    public List<Capacitaciones> obtenerCapacitaciones(){
        return (List<Capacitaciones>) capacitacionesRepository.findAll();}

    @Override
    public Capacitaciones guardarCapacitaciones(Capacitaciones capacitaciones){
        return capacitacionesRepository.save(capacitaciones);}
}
