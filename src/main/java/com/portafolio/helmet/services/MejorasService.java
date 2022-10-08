package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.MejorasDao;
import com.portafolio.helmet.entities.Mejoras;
import com.portafolio.helmet.repositories.MejorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MejorasService implements MejorasDao {
    @Autowired
    private MejorasRepository mejorasRepository;

    @Override
    public List<Mejoras> obtenerMejoras(){
        return (List<Mejoras>) mejorasRepository.findAll();}

    @Override
    public Mejoras guardarMejoras(Mejoras mejoras){
        return mejorasRepository.save(mejoras);}

}
