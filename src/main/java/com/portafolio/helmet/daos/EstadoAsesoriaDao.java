package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstadoAsesoria;

import java.util.List;
import java.util.Optional;

public interface EstadoAsesoriaDao {
    List<EstadoAsesoria> obtenerEstadoAsesoria();

    Optional<EstadoAsesoria> obtenerEstadoAsesoriaPorId(Long idEstadoAsesoria);

    EstadoAsesoria guardarEstadoAsesoria(EstadoAsesoria estadoAsesoria);
}
