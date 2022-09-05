package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.AccidenteDao;
import com.portafolio.helmet.entities.Accidente;
import com.portafolio.helmet.repositories.AccidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccidenteService implements AccidenteDao {


    @Autowired
    private AccidenteRepository accidenteRepository;


    @Override
    public List<Accidente> obtenerAccidente(){
        return (List<Accidente>) accidenteRepository.findAll();
    }

    @Override
    public Accidente guardarAccidente(Accidente accidente){
        return accidenteRepository.save(accidente);
    }
}
