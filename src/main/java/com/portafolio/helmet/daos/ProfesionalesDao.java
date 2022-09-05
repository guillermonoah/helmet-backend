package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Profesionales;

import java.util.List;

public interface ProfesionalesDao {

    List<Profesionales> obtenerProfesionales();

    Profesionales guardarProfesionales(Profesionales profesionales);
}
