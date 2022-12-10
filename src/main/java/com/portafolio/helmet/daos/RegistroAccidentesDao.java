package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.RegistroAccidentes;

import java.util.List;
import java.util.Optional;

public interface RegistroAccidentesDao {

    List<RegistroAccidentes> obtenerRegistroAccidentes();

    Optional<RegistroAccidentes> obtenerRegistroAccidentesPorId(Long idRegistroAccidentes);

    RegistroAccidentes guardarRegistroAccidentes(RegistroAccidentes registroAccidentes);
}
