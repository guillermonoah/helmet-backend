package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Rubro;

import java.util.List;

public interface RubroDao {
    List<Rubro> obtenerRubro();

    Rubro guardarRubro(Rubro rubro);
}
