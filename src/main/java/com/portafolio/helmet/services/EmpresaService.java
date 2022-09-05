package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.EmpresaDao;
import com.portafolio.helmet.entities.Clientes;
import com.portafolio.helmet.entities.Empresa;
import com.portafolio.helmet.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService implements EmpresaDao {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> obtenerEmpresa(){
        return (List<Empresa>) empresaRepository.findAll();
    }

    @Override
    public Empresa guardarEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }
}
