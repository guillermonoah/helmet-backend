package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mejoras")
@Getter
@Setter
public class Mejoras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUsuario;
    private Long idCliente;
    private String nombre;
    private Date fecha;
    private String aprobadoPor;

}
