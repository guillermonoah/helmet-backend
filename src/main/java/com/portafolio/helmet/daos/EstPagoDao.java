package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstPago;

import java.util.List;
import java.util.Optional;

public interface EstPagoDao {

    List<EstPago> obtenerEstPago();

    Optional<EstPago> obtenerEstPagoId(Long idEstPago);

    EstPago guardarEstPago(EstPago estPago);
}
