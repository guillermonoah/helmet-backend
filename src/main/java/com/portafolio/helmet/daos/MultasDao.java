package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Multas;

import java.util.List;
import java.util.Optional;

public interface MultasDao {
    List<Multas> obtenerMultas();

    Optional<Multas> obtenerMultasPorId(Long idMultas);

    Multas guardarMultas(Multas multas);
}
