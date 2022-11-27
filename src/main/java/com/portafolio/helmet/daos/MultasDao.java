package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Multas;

import java.util.List;

public interface MultasDao {
    List<Multas> obtenerMultas();
    Multas guardarMultas(Multas multas);
}
