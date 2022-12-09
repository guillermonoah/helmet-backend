package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstVis;

import java.util.List;
import java.util.Optional;

public interface EstVisDao {

    List<EstVis> obtenerEstVis();

    Optional<EstVis> obtenerEstVisPorId(Long idEstVis);

    EstVis guardarEstVis(EstVis estVis);
}
