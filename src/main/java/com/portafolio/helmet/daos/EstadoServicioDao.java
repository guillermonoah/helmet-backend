package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstadoServicio;

import java.util.List;

public interface EstadoServicioDao {
    List<EstadoServicio> obtenerEstadoServicio();
    EstadoServicio guardarEstadoServicio(EstadoServicio estadoServicio);
}
