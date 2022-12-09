package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.RegistroAccidentesDao;
import com.portafolio.helmet.entities.RegistroAccidentes;
import com.portafolio.helmet.repositories.RegistroAccidentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroAccidentesService implements RegistroAccidentesDao {


    @Autowired
    private RegistroAccidentesRepository registroAccidentesRepository;


    @Override
    public List<RegistroAccidentes> obtenerRegistroAccidentes(){
        return (List<RegistroAccidentes>) registroAccidentesRepository.findAll();
    }
    @Override
    public Optional<RegistroAccidentes> obtenerRegistroAccidentesPorId(Long idRegistroAccidentes) {
        Optional<RegistroAccidentes> ra = registroAccidentesRepository.findById(idRegistroAccidentes);
        if(!ra.isPresent()){
            return null;
        }
        return ra;
    }
    @Override
    public RegistroAccidentes guardarRegistroAccidentes(RegistroAccidentes registroAccidentes){
        return registroAccidentesRepository.save(registroAccidentes);
    }
}
