package com.portafolio.helmet.security.dtos;

import javax.validation.constraints.NotBlank;

public class LoginUser {

    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

 /*
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
    }*/
}
