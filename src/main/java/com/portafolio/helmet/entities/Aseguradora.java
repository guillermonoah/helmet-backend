package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "aseguradora")
@Getter
@Setter
public class Aseguradora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String aseguradora;
    private String rut;
    private String email;
    private String telefono;
    private String cobertura;


}
