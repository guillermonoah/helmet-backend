package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.RubroDao;
import com.portafolio.helmet.entities.Rubro;
import com.portafolio.helmet.repositories.RubroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroService implements RubroDao {
    @Autowired
    private RubroRepository rubroRepository;
    @Override
    public List<Rubro> obtenerRubro(){
        return (List<Rubro>) rubroRepository.findAll();
    }
    @Override
    public Rubro guardarRubro(Rubro rubro){
        return rubroRepository.save(rubro);
    }
}
