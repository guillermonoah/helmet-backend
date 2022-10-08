package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.ActividadProfesionalDao;
import com.portafolio.helmet.entities.ActividadProfesional;
import com.portafolio.helmet.repositories.ActividadProfesionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadProfesionalService implements ActividadProfesionalDao {

    @Autowired
    private ActividadProfesionalRepository actividadProfesionalRepository;

    @Override
    public List<ActividadProfesional> obtenerActividadProfesional(){
        return (List<ActividadProfesional>) actividadProfesionalRepository.findAll();
    }

    @Override
    public ActividadProfesional guardarActividadProfesional(ActividadProfesional actividadProfesional){
        return actividadProfesionalRepository.save(actividadProfesional);
    }
}
