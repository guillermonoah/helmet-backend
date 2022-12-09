package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.DetallePago;

import java.util.List;
import java.util.Optional;

public interface DetallePagoDao {
    Optional<DetallePago> obteneridDetallePagoPorId(Long idDetallePago);

    List<DetallePago> obtenerDetallePago();
    DetallePago guardarDetallePago(DetallePago detallePago);
}
