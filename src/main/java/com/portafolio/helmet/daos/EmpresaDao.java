package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Empresa;

import java.util.List;

public interface EmpresaDao {

    List<Empresa> obtenerEmpresa();

    Empresa guardarEmpresa(Empresa empresa);
}
