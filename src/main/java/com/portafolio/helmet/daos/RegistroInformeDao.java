package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.RegistroInforme;

import java.util.List;

public interface RegistroInformeDao {
    List<RegistroInforme> obtenerRegistroInforme();
    RegistroInforme guardarRegistroInforme(RegistroInforme registroInforme);
}
