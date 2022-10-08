package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstActividad;

import java.util.List;

public interface EstActividadDao {
    List<EstActividad> obtenerEstActividad();

    EstActividad guardarEstActividad(EstActividad estActividad);
}
