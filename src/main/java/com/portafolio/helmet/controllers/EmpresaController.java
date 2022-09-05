package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.EmpresaDao;
import com.portafolio.helmet.entities.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {


    @Autowired
    private EmpresaDao empresaDao;

    @GetMapping
    public List<Empresa> obtenerEmpresa(){
        return empresaDao.obtenerEmpresa();
    }

    @PostMapping
    public Empresa guardarEmpresa(@RequestBody Empresa empresa){
        return empresaDao.guardarEmpresa(empresa);
    }
}
