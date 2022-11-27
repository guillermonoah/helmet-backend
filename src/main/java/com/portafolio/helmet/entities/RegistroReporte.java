package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "registroreporte")
@Getter
@Setter
public class RegistroReporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String nombreRep;
    private Long idCliente;
    private Long idUsuario;
}
