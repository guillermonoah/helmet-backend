package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Servicio;

import java.util.List;

public interface ServicioDao {
    List<Servicio> obtenerServicios();
    Servicio guardarServicio(Servicio servicio);
}
