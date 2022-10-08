package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Pagos;

import java.util.List;

public interface PagosDao {
    List<Pagos> obtenerPagos();

    Pagos guardarPagos(Pagos pagos);
}
