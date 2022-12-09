package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstadoServicio;

import java.util.List;
import java.util.Optional;

public interface EstadoServicioDao {
    List<EstadoServicio> obtenerEstadoServicio();

    Optional<EstadoServicio> obtenerEstadoServicioPorId(Long idEstadoServicio);

    EstadoServicio guardarEstadoServicio(EstadoServicio estadoServicio);
}
