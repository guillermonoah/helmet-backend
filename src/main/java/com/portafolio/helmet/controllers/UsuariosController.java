package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.UsuariosDao;
import com.portafolio.helmet.entities.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosDao usuariosDao;

    @GetMapping
    public List<Usuarios> obtenerUsuarios(){
        return usuariosDao.obtenerUsuarios();
    }

    @PostMapping
    public Usuarios guardarUsuarios(@RequestBody Usuarios usuarios){
        return usuariosDao.guardarUsuarios(usuarios);
    }



}
