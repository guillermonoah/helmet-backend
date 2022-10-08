package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Mejoras;

import java.util.List;

public interface MejorasDao {
    List<Mejoras> obtenerMejoras();

    Mejoras guardarMejoras(Mejoras mejoras);
}
