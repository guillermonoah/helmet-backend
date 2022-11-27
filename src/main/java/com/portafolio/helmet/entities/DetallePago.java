package com.portafolio.helmet.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "detallePago")
@Getter
@Setter
public class DetallePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idPago;
    private Long idServicio;
    private String nombre;
    private Long valor;
    private Long cantidad;
    private Long subtotal;
    private Long neto;
    private Long iva;
    private Long total;
}
