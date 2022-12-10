package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.RegistroLlamadasDao;
import com.portafolio.helmet.entities.RegistroLlamadas;
import com.portafolio.helmet.repositories.RegistroLlamadasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroLlamadasService implements RegistroLlamadasDao {
    @Autowired
    private RegistroLlamadasRepository registroLlamadasRepository;

    @Override
    public List<RegistroLlamadas> obtenerRegistroLlamadas(){
        return (List<RegistroLlamadas>) registroLlamadasRepository.findAll();
    }
    @Override
    public Optional<RegistroLlamadas> obtenerRegistroLlamadasPorId(Long idRegistroLlamadas) {
        Optional<RegistroLlamadas> rll = registroLlamadasRepository.findById(idRegistroLlamadas);
        if(!rll.isPresent()){
            return null;
        }
        return rll;
    }
    @Override
    public RegistroLlamadas guardarRegistroLlamadas(RegistroLlamadas registroLlamadas){
    return registroLlamadasRepository.save(registroLlamadas);
    }
}
