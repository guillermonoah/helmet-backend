package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Capacitaciones;

import java.util.List;

public interface CapacitacionesDao {
    List<Capacitaciones> obtenerCapacitaciones();

    Capacitaciones guardarCapacitaciones(Capacitaciones capacitaciones);
}
