package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Asesoria;

import java.util.List;

public interface AsesoriaDao {

    List<Asesoria> obtenerAsesoria();

    Asesoria guardarAsesoria(Asesoria asesoria);
}
