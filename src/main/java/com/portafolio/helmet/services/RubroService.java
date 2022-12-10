package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.RubroDao;
import com.portafolio.helmet.entities.Rubro;
import com.portafolio.helmet.repositories.RubroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RubroService implements RubroDao {
    @Autowired
    private RubroRepository rubroRepository;
    @Override
    public List<Rubro> obtenerRubro(){
        return (List<Rubro>) rubroRepository.findAll();
    }
    @Override
    public Optional<Rubro> obtenerRubroPorId(Long idRubro) {
        Optional<Rubro> rb = rubroRepository.findById(idRubro);
        if(!rb.isPresent()){
            return null;
        }
        return rb;
    }

    @Override
    public Rubro guardarRubro(Rubro rubro){
        return rubroRepository.save(rubro);
    }
}
