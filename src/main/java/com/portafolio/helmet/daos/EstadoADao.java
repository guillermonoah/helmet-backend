package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstadoA;

import java.util.List;
import java.util.Optional;

public interface EstadoADao {
    List<EstadoA> obtenerEstadoA();

    Optional<EstadoA> obtenerEstadoAPorId(Long idEstadoA);

    EstadoA guardarEstadoA(EstadoA estadoA);
}
