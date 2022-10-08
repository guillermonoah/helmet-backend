package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "capacitaciones")
@Getter
@Setter
public class Capacitaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idProfesional;
    private Long idEmpresa;
    private String titulo;
    private String observacion;
    private String materialAdd;
}
