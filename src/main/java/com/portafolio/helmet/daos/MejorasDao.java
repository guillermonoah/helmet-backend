package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Mejoras;

import java.util.List;
import java.util.Optional;

public interface MejorasDao {
    List<Mejoras> obtenerMejoras();

    Optional<Mejoras> obtenerMejorasPorId(Long idMejoras);

    Mejoras guardarMejoras(Mejoras mejoras);
}
