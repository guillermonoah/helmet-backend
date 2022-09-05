package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.ProfesionalesDao;
import com.portafolio.helmet.entities.Profesionales;
import com.portafolio.helmet.repositories.ProfesionalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesionalesService implements ProfesionalesDao {

    @Autowired
    private ProfesionalesRepository profesionalesRepository;

    @Override
    public List<Profesionales> obtenerProfesionales(){
        return (List<Profesionales>)profesionalesRepository.findAll();
    }

    @Override
    public Profesionales guardarProfesionales(Profesionales profesionales){
        return profesionalesRepository.save(profesionales);
    }
}
