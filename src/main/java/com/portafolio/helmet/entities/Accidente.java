package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "accidente")
@Getter
@Setter
public class Accidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCliente;
    private Long idGravedad;
    private Long idEstadoA;
    private Date fecha;
    private String nombreTrabajador;
    private String rutT;
    private String cargoT;
    private String lugarA;
    private String observacion;
}
