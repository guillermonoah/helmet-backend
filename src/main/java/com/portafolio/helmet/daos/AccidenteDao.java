package com.portafolio.helmet.daos;

import com.portafolio.helmet.dtos.AccidenteDto;
import com.portafolio.helmet.entities.Accidente;

import java.util.List;
import java.util.Optional;

public interface AccidenteDao {

    List<Accidente> obtenerAccidente();

    Optional<Accidente> obtenerAccidentePorId(Long idAccidente);

    Accidente guardarAccidente(Accidente accidente);

    Accidente actualizarAccidentePorId(Long idAccidente, Long idGravedad, AccidenteDto accidenteDto);
}
