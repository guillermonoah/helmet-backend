package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.RegistroReporteDao;
import com.portafolio.helmet.entities.RegistroReporte;
import com.portafolio.helmet.repositories.RegistroReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroReporteService implements RegistroReporteDao {

    @Autowired
    private RegistroReporteRepository registroReporteRepository;
    @Override
    public List<RegistroReporte> obtenerRegistroReporte(){
        return (List<RegistroReporte>) registroReporteRepository.findAll();
    }
    @Override
    public RegistroReporte guardarRegistroReporte(RegistroReporte registroReporte){
        return registroReporteRepository.save(registroReporte);
    }
}
