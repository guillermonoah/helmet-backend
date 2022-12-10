package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Capacitaciones;

import java.util.List;
import java.util.Optional;

public interface CapacitacionesDao {
    List<Capacitaciones> obtenerCapacitaciones();

    Optional<Capacitaciones> obtenerCapacitacionesPorId(Long idCapacitaciones);

    Capacitaciones guardarCapacitaciones(Capacitaciones capacitaciones);
}
