package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.RegistroReporte;

import java.util.List;

public interface RegistroReporteDao {
    List<RegistroReporte> obtenerRegistroReporte();
    RegistroReporte guardarRegistroReporte(RegistroReporte registroReporte);

    boolean eliminarPorId(Long id);
}
