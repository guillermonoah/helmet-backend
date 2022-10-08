package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.ActividadProfesional;

import java.util.List;

public interface ActividadProfesionalDao {

    List<ActividadProfesional> obtenerActividadProfesional();

    ActividadProfesional guardarActividadProfesional(ActividadProfesional actividadProfesional);

}
