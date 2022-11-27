package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Accidente;

import java.util.List;

public interface AccidenteDao {

    List<Accidente> obtenerAccidente();


    Accidente guardarAccidente(Accidente accidente);
}
