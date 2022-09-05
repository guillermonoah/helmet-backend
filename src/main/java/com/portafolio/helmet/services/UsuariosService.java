package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.UsuariosDao;
import com.portafolio.helmet.entities.Usuarios;
import com.portafolio.helmet.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsuariosService implements UsuariosDao{

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public List<Usuarios> obtenerUsuarios(){
        return (List<Usuarios>) usuariosRepository.findAll();
    }

    @Override
    public Usuarios guardarUsuarios(Usuarios usuarios) {
        return usuariosRepository.save(usuarios);
    }
}
