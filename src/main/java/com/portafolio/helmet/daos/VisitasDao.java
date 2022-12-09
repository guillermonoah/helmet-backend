package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Visitas;

import java.util.List;
import java.util.Optional;

public interface VisitasDao {

    List<Visitas> obtenerVisitas();

    Optional<Visitas> obtenerVisitasPorId(Long idVisitas);

    Visitas guardarVisitas(Visitas visitas);
}
