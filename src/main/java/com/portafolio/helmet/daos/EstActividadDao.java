package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstActividad;

import java.util.List;
import java.util.Optional;

public interface EstActividadDao {
    List<EstActividad> obtenerEstActividad();

    Optional<EstActividad> obtenerEstActividadPorId(Long idEstActividad);

    EstActividad guardarEstActividad(EstActividad estActividad);
}
