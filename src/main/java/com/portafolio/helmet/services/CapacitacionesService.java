package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.CapacitacionesDao;
import com.portafolio.helmet.entities.Capacitaciones;
import com.portafolio.helmet.repositories.CapacitacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapacitacionesService implements CapacitacionesDao {

    @Autowired
    private CapacitacionesRepository capacitacionesRepository;

    @Override
    public List<Capacitaciones> obtenerCapacitaciones(){
        return (List<Capacitaciones>) capacitacionesRepository.findAll();}
    @Override
    public Optional<Capacitaciones> obtenerCapacitacionesPorId(Long idCapacitaciones) {
        Optional<Capacitaciones> cap = capacitacionesRepository.findById(idCapacitaciones);
        if(!cap.isPresent()){
            return null;
        }
        return cap;
    }
    @Override
    public Capacitaciones guardarCapacitaciones(Capacitaciones capacitaciones){
        return capacitacionesRepository.save(capacitaciones);}
}
