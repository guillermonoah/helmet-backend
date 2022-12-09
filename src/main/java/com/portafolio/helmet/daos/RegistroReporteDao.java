package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.RegistroReporte;

import java.util.List;
import java.util.Optional;

public interface RegistroReporteDao {
    List<RegistroReporte> obtenerRegistroReporte();

    Optional<RegistroReporte> obtenerRegistroReportePorId(Long idRegistroReporte);

    RegistroReporte guardarRegistroReporte(RegistroReporte registroReporte);

    boolean eliminarPorId(Long id);
}
