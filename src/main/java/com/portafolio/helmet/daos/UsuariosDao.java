package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Usuarios;

import java.util.List;

public interface UsuariosDao {
    List<Usuarios> obtenerUsuarios();

    Usuarios guardarUsuarios(Usuarios usuarios);
}
