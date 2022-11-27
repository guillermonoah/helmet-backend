package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.RegistroLlamadas;

import java.util.List;

public interface RegistroLlamadasDao {

    List<RegistroLlamadas> obtenerRegistroLlamadas();
    RegistroLlamadas guardarRegistroLlamadas(RegistroLlamadas registroLlamadas);
}
