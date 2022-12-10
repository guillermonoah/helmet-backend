package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Clientes;

import java.util.List;
import java.util.Optional;

public interface ClientesDao {

    List<Clientes> obtenerClientes();

    Optional<Clientes> obtenerClientesPorId(Long idClientes);

    Clientes guardarClientes(Clientes clientes);
    boolean eliminarPorId(Long id);
}
