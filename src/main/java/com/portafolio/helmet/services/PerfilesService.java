package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.PerfilesDao;
import com.portafolio.helmet.entities.Perfiles;
import com.portafolio.helmet.repositories.PerfilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilesService implements PerfilesDao {

    @Autowired
    private PerfilesRepository perfilesRepository;

    @Override
    public List<Perfiles> obtenerPerfiles(){
        return (List<Perfiles>) perfilesRepository.findAll();
    }
    @Override
    public Optional<Perfiles> obtenerPerfilesPorId(Long idPerfiles) {
        Optional<Perfiles> pr = perfilesRepository.findById(idPerfiles);
        if(!pr.isPresent()){
            return null;
        }
        return pr;
    }
    @Override
    public Perfiles guardarPerfiles(Perfiles perfiles){
        return  perfilesRepository.save(perfiles);
    }

}
