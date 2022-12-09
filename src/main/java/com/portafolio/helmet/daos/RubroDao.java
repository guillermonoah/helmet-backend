package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Rubro;

import java.util.List;
import java.util.Optional;

public interface RubroDao {
    List<Rubro> obtenerRubro();

    Optional<Rubro> obtenerRubroPorId(Long idRubro);

    Rubro guardarRubro(Rubro rubro);
}
