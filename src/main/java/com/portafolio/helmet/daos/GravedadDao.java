package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Gravedad;

import java.util.List;
import java.util.Optional;

public interface GravedadDao {


    List<Gravedad> obtenerGravedad();


    Optional<Gravedad> obtenerGravedadPorId(Long idGravedad);

    Gravedad guardarGravedad(Gravedad gravedad);
}
