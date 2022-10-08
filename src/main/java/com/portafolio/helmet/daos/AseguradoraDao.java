package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Aseguradora;

import java.util.List;

public interface AseguradoraDao {


    List<Aseguradora> obtenerAseguradora();


    Aseguradora guardarAseguradora(Aseguradora aseguradora);
}
