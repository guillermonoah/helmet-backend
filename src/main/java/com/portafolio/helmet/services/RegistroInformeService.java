package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.RegistroInformeDao;
import com.portafolio.helmet.entities.RegistroInforme;
import com.portafolio.helmet.repositories.RegistroInformeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroInformeService implements RegistroInformeDao {
    @Autowired
    private RegistroInformeRepository registroInformeRepository;
    @Override
    public List<RegistroInforme> obtenerRegistroInforme(){
        return (List<RegistroInforme>) registroInformeRepository.findAll();
    }
    @Override
    public RegistroInforme guardarRegistroInforme(RegistroInforme registroInforme){
        return registroInformeRepository.save(registroInforme);
    }
}
