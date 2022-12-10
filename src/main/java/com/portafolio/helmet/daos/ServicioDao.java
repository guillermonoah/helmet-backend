package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Servicio;

import java.util.List;
import java.util.Optional;

public interface ServicioDao {
    List<Servicio> obtenerServicios();

    Optional<Servicio> obtenerServicioPorId(Long idServicio);

    Servicio guardarServicio(Servicio servicio);
}
