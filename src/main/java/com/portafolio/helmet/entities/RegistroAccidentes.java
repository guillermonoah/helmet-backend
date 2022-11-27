package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "registroAccidentes")
@Getter
@Setter
public class RegistroAccidentes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCliente;
    private Long idEstado;
    private Long idAccidente;
    private Long idUsuario;
}
