package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.PerfilesDao;
import com.portafolio.helmet.entities.Perfiles;
import com.portafolio.helmet.repositories.PerfilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilesService implements PerfilesDao {

    @Autowired
    private PerfilesRepository perfilesRepository;

    @Override
    public List<Perfiles> obtenerPerfiles(){
        return (List<Perfiles>) perfilesRepository.findAll();
    }

    @Override
    public Perfiles guardarPerfiles(Perfiles perfiles){
        return  perfilesRepository.save(perfiles);
    }

}
