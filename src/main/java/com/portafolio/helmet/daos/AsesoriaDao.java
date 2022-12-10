package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Asesoria;

import java.util.List;
import java.util.Optional;

public interface AsesoriaDao {

    List<Asesoria> obtenerAsesoria();

    Optional<Asesoria> obtenerAsesoriaPorId(Long idAsesoria);

    Asesoria guardarAsesoria(Asesoria asesoria);
}
