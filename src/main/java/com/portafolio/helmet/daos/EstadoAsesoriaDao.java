package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstadoAsesoria;

import java.util.List;

public interface EstadoAsesoriaDao {
    List<EstadoAsesoria> obtenerEstadoAsesoria();

    EstadoAsesoria guardarEstadoAsesoria(EstadoAsesoria estadoAsesoria);
}
