package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Perfiles;

import java.util.List;

public interface PerfilesDao {
    List<Perfiles> obtenerPerfiles();

    Perfiles guardarPerfiles(Perfiles perfiles);
}
