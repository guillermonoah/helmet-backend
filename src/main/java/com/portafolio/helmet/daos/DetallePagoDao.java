package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.DetallePago;

import java.util.List;

public interface DetallePagoDao {
    List<DetallePago> obtenerDetallePago();
    DetallePago guardarDetallePago(DetallePago detallePago);
}
