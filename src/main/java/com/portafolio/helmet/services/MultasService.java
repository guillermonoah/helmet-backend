package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.MultasDao;
import com.portafolio.helmet.entities.Multas;
import com.portafolio.helmet.repositories.MultasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultasService implements MultasDao {
    @Autowired
    private MultasRepository multasRepository;
    @Override
    public List<Multas> obtenerMultas(){
        return (List<Multas>) multasRepository.findAll();
    }
    @Override
    public Multas guardarMultas(Multas multas){
        return multasRepository.save(multas);
    }
}
