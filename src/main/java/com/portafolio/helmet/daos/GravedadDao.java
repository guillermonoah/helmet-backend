package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Gravedad;

import java.util.List;

public interface GravedadDao {


    List<Gravedad> obtenerGravedad();


    Gravedad guardarGravedad(Gravedad gravedad);
}
