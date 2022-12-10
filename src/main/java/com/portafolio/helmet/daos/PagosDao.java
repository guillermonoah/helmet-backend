package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Pagos;

import java.util.List;
import java.util.Optional;

public interface PagosDao {
    List<Pagos> obtenerPagos();

    Optional<Pagos> obtenerPagosPorId(Long idPagos);

    Pagos guardarPagos(Pagos pagos);
}
