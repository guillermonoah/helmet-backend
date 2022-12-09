package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.AccidenteDao;
import com.portafolio.helmet.dtos.AccidenteDto;
import com.portafolio.helmet.entities.Accidente;
import com.portafolio.helmet.repositories.AccidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccidenteService implements AccidenteDao {
    @Autowired
    private AccidenteRepository accidenteRepository;

    @Override
    public List<Accidente> obtenerAccidente(){
        return (List<Accidente>) accidenteRepository.findAll();
    }
    @Override
    public Optional<Accidente> obtenerAccidentePorId(Long idAccidente) {
        Optional<Accidente> ao = accidenteRepository.findById(idAccidente);
        if(!ao.isPresent()){
            return null;
        }
        return ao;
    }

    @Override
    public Accidente guardarAccidente(Accidente accidente){
        return accidenteRepository.save(accidente);
    }

    @Override
    public Accidente actualizarAccidentePorId(Long idAccidente, Long idGravedad, AccidenteDto accidenteDto) {

        Optional<Accidente> ao = accidenteRepository.findById(idAccidente);

        if (!ao.isPresent()){
            return null;
        }

        Accidente accidente = ao.get();

        accidente.setIdGravedad(idGravedad);
        accidente.setObservacion(accidenteDto.getObs());

        return accidenteRepository.save(accidente);
    }
}
