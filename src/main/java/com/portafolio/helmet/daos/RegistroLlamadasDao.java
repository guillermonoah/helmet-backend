package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.RegistroLlamadas;

import java.util.List;
import java.util.Optional;

public interface RegistroLlamadasDao {

    List<RegistroLlamadas> obtenerRegistroLlamadas();

    Optional<RegistroLlamadas> obtenerRegistroLlamadasPorId(Long idRegistroLlamadas);

    RegistroLlamadas guardarRegistroLlamadas(RegistroLlamadas registroLlamadas);
}
