package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.AsesoriaDao;
import com.portafolio.helmet.entities.Asesoria;
import com.portafolio.helmet.repositories.AsesoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsesoriaService implements AsesoriaDao {

    @Autowired
    private AsesoriaRepository asesoriaRepository;

    @Override
    public List<Asesoria> obtenerAsesoria(){
        return (List<Asesoria>) asesoriaRepository.findAll();}

    @Override
    public Asesoria guardarAsesoria(Asesoria asesoria){
        return asesoriaRepository.save(asesoria);}
}
