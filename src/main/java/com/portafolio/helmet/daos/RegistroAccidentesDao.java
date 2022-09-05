package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.RegistroAccidentes;

import java.util.List;

public interface RegistroAccidentesDao {

    List<RegistroAccidentes> obtenerRegistroAccidentes();

    RegistroAccidentes guardarRegistroAccidentes(RegistroAccidentes registroAccidentes);
}
