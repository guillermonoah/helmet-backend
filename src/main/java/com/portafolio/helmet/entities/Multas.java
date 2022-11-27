package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "multas")
@Getter
@Setter
public class Multas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String motivo;
    private Long valor;
    private Date fechaPago;
    private Long idEstPag;
    private Long idAsesoria;
}
