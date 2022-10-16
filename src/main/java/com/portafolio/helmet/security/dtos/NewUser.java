package com.portafolio.helmet.security.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewUser {

    @NotBlank
    private Long idPerfil;
    @NotBlank
    private String usuario;
    @NotBlank
    private String contraseña;
    @NotBlank
    private String nombre;
    @NotBlank
    private String rut;
    @NotBlank
    private String email;
    @NotBlank
    private String telefono;


}
