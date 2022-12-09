package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.EstVisDao;
import com.portafolio.helmet.entities.EstVis;
import com.portafolio.helmet.repositories.EstVisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstVisService implements EstVisDao {

    @Autowired
    private EstVisRepository estVisRepository;

    @Override
    public List<EstVis> obtenerEstVis(){return (List<EstVis>) estVisRepository.findAll();}
    @Override
    public Optional<EstVis> obtenerEstVisPorId(Long idEstVis) {
        Optional<EstVis> ev = estVisRepository.findById(idEstVis);
        if(!ev.isPresent()){
            return null;
        }
        return ev;
    }
    @Override
    public EstVis guardarEstVis(EstVis estVis){ return estVisRepository.save(estVis);}
}
