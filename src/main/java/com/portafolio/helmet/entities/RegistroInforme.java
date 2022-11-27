package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "registroinforme")
@Getter
@Setter
public class RegistroInforme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String nombreInfo;
    private Long idCliente;
    private Long idUsuario;
}
