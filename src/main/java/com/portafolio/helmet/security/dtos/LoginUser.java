package com.portafolio.helmet.security.dtos;

import javax.validation.constraints.NotBlank;

public class LoginUser {
    @NotBlank
    private String usuario;

    @NotBlank
    private String contraseña;
    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getContraseña(){
            return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
