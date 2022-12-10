package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.RegistroInforme;

import java.util.List;
import java.util.Optional;

public interface RegistroInformeDao {
    List<RegistroInforme> obtenerRegistroInforme();

    Optional<RegistroInforme> obtenerRegistroInformePorId(Long idRegistroInforme);

    RegistroInforme guardarRegistroInforme(RegistroInforme registroInforme);
}
