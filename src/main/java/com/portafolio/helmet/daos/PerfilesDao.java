package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Perfiles;

import java.util.List;
import java.util.Optional;

public interface PerfilesDao {
    List<Perfiles> obtenerPerfiles();

    Optional<Perfiles> obtenerPerfilesPorId(Long idPerfiles);

    Perfiles guardarPerfiles(Perfiles perfiles);
}
