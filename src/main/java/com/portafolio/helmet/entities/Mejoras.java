package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "mejoras")
@Getter
@Setter
public class Mejoras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idProfesional;
    private Long idEmpresa;
    private String nombre;
    private String sugerencias;

}
