package com.portafolio.helmet.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "asesoria")
@Getter
@Setter
public class Asesoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUsuario;
    private Long idCliente;
    private Date fecha;
    private String motivo;
}
