package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.EstVis;

import java.util.List;

public interface EstVisDao {

    List<EstVis> obtenerEstVis();

    EstVis guardarEstVis(EstVis estVis);
}
