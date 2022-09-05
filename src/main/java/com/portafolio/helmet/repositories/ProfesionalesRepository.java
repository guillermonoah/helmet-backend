package com.portafolio.helmet.repositories;

import com.portafolio.helmet.entities.Empresa;
import com.portafolio.helmet.entities.Profesionales;
import org.springframework.data.repository.CrudRepository;



public interface ProfesionalesRepository extends CrudRepository<Profesionales, Long> {
}
