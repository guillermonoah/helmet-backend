package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "actividadProfesional")
@Getter
@Setter
public class ActividadProfesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idProfesional;
    private Long idEstAct;
    private String nombre;
    private String descripcion;
}
