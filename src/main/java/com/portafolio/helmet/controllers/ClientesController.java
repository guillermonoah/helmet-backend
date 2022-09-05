package com.portafolio.helmet.controllers;


import com.portafolio.helmet.daos.ClientesDao;
import com.portafolio.helmet.entities.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {

    @Autowired
    private ClientesDao clientesDao;

    @GetMapping
    public List<Clientes> obtenerClientes(){
        return clientesDao.obtenerClientes();
    }

    @PostMapping
    public Clientes guardarClientes(@RequestBody Clientes clientes){
        return clientesDao.guardarClientes(clientes);
    }
}
