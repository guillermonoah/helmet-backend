package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstPago;

import java.util.List;

public interface EstPagoDao {

    List<EstPago> obtenerEstPago();

    EstPago guardarEstPago(EstPago estPago);
}
