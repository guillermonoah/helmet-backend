package com.portafolio.helmet.security.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
@Table(name = "usuarioL")
@Getter
@Setter
public class UsuarioL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NaturalId
    @Column(unique = true)
    private String usuario;

    @NotNull
    @Column(name = "idPerfil")
    private Long idPerfil;

    @NotNull
    private String contraseña;

    @Column(name = "nombre")
    @NotNull
    private String nombre;

    @Null
    @Column(name = "rut", length = 15)
    private String rut;

    @NotNull
    @Email
    @Column(length = 100)
    private String email;

    @Null
    @Column(name = "telefono")
    private String telefono;

    public UsuarioL(){}

    public UsuarioL(@NotNull String usuario, @NotNull String email, @NotNull String contraseña)
    {
        this.usuario = usuario;
        this.email = email;
        this.contraseña =contraseña;
    }
}
