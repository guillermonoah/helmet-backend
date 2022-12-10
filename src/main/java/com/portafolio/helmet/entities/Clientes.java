package com.portafolio.helmet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUsuario;
    private Long idEstServicio;
    private Long idRubro;
    private Long idEstPago;
    private Long diaPago;
    private String nombreEmpresa;
    private String rutEmpresa;
    private String email;
    private String nombreContacto;
    private String rutContacto;
}
