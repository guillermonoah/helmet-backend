package com.portafolio.helmet.repositories;

import com.portafolio.helmet.entities.Empresa;
import org.springframework.data.repository.CrudRepository;


public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
}
