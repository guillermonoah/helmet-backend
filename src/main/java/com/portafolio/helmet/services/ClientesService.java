package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.ClientesDao;
import com.portafolio.helmet.entities.Clientes;
import com.portafolio.helmet.repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService implements ClientesDao {

    @Autowired
   private ClientesRepository clientesRepository;

    @Override
    public List<Clientes> obtenerClientes(){

        return (List<Clientes>) clientesRepository.findAll();
    }
    @Override
    public Clientes guardarClientes(Clientes clientes){
        return clientesRepository.save(clientes);
    }
    public boolean eliminarPorId(Long id){
        try{
            clientesRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
