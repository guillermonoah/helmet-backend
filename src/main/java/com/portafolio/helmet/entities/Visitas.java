package com.portafolio.helmet.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Visitas")
@Getter
@Setter
public class Visitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCliente;
    private Long idUsuario;
    private Long idEstVis;
    private Date fechaVisita;
    private String horaVisita;
    private Date fechaSolicitud;
}
