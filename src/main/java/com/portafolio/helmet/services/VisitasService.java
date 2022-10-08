package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.VisitasDao;
import com.portafolio.helmet.entities.Visitas;
import com.portafolio.helmet.repositories.VisitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitasService implements VisitasDao {

    @Autowired
    private VisitasRepository visitasRepository;

    @Override
    public List<Visitas> obtenerVisitas() { return (List<Visitas>) visitasRepository.findAll();}

    @Override
    public Visitas guardarVisitas(Visitas visitas){return visitasRepository.save(visitas);}
}
