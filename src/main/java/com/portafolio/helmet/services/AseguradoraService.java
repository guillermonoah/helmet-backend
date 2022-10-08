package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.AseguradoraDao;
import com.portafolio.helmet.entities.Aseguradora;
import com.portafolio.helmet.repositories.AseguradoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AseguradoraService implements AseguradoraDao {

    @Autowired
    private AseguradoraRepository aseguradoraRepository;

    @Override
    public List<Aseguradora> obtenerAseguradora(){
        return (List<Aseguradora>) aseguradoraRepository.findAll();
    }

    @Override
    public Aseguradora guardarAseguradora(Aseguradora aseguradora){
        return aseguradoraRepository.save(aseguradora);
    }
}
