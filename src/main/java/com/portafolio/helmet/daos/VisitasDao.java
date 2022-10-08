package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Visitas;

import java.util.List;

public interface VisitasDao {

    List<Visitas> obtenerVisitas();

    Visitas guardarVisitas(Visitas visitas);
}
