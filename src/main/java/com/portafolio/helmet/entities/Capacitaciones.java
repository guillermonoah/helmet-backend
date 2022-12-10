package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "capacitaciones")
@Getter
@Setter
public class Capacitaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUsuario;
    private Long idCliente;
    private String titulo;
    private String materialAdd;
    private Long nAsistentes;
    private String lugar;
    private Date fecha;
}
