package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.GravedadDao;
import com.portafolio.helmet.entities.Gravedad;
import com.portafolio.helmet.repositories.GravedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GravedadService implements GravedadDao {
    @Autowired
    private GravedadRepository gravedadRepository;

    @Override
    public List<Gravedad> obtenerGravedad(){
        return (List<Gravedad>) gravedadRepository.findAll();
    }
    @Override
    public Optional<Gravedad> obtenerGravedadPorId(Long idGravedad) {
        Optional<Gravedad> gr = gravedadRepository.findById(idGravedad);
        if(!gr.isPresent()){
            return null;
        }
        return gr;
    }
    @Override
    public Gravedad guardarGravedad(Gravedad gravedad){
        return gravedadRepository.save(gravedad);
    }
}
