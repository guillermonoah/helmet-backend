package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.RegistroAccidentesDao;
import com.portafolio.helmet.entities.RegistroAccidentes;
import com.portafolio.helmet.repositories.RegistroAccidentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroAccidentesService implements RegistroAccidentesDao {


    @Autowired
    private RegistroAccidentesRepository registroAccidentesRepository;


    @Override
    public List<RegistroAccidentes> obtenerRegistroAccidentes(){
        return (List<RegistroAccidentes>) registroAccidentesRepository.findAll();
    }

    @Override
    public RegistroAccidentes guardarRegistroAccidentes(RegistroAccidentes registroAccidentes){
        return registroAccidentesRepository.save(registroAccidentes);
    }
}
