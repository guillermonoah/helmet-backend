package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.MultasDao;
import com.portafolio.helmet.entities.Multas;
import com.portafolio.helmet.repositories.MultasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultasService implements MultasDao {
    @Autowired
    private MultasRepository multasRepository;
    @Override
    public List<Multas> obtenerMultas(){
        return (List<Multas>) multasRepository.findAll();
    }
    @Override
    public Optional<Multas> obtenerMultasPorId(Long idMultas) {
        Optional<Multas> ml = multasRepository.findById(idMultas);
        if(!ml.isPresent()){
            return null;
        }
        return ml;
    }
    @Override
    public Multas guardarMultas(Multas multas){
        return multasRepository.save(multas);
    }
}
