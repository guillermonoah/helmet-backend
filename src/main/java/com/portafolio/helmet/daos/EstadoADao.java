package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstadoA;

import java.util.List;

public interface EstadoADao {
    List<EstadoA> obtenerEstadoA();

    EstadoA guardarEstadoA(EstadoA estadoA);
}
