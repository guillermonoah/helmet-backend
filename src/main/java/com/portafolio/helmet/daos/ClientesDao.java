package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Clientes;

import java.util.List;

public interface ClientesDao {

    List<Clientes> obtenerClientes();

    Clientes guardarClientes(Clientes clientes);
    boolean eliminarPorId(Long id);
}
