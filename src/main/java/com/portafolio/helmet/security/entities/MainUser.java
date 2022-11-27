package com.portafolio.helmet.security.entities;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MainUser implements UserDetails {

    private String userName;
    private String email;
    private String password;
    private String name;
    private String rut;
    private Long idCliente;

    private String nombreDoc;
    private Collection<? extends GrantedAuthority> authorities;


    public MainUser(String userName, String email, String password,
                    String name,String rut,Long idCliente,String nombreDoc,
                    Collection<? extends GrantedAuthority> authorities) {

        this.userName = userName;
        this.email = email;
        this.password = password;
        this.name = name;
        this.rut = rut;
        this.idCliente = idCliente;
        this.nombreDoc = nombreDoc;
        this.authorities = authorities;
    }

    public static MainUser build(User user){
        List<GrantedAuthority> authorities = user.getRoles().stream().map(role-> new SimpleGrantedAuthority(role.getRoleName().name())).collect(Collectors.toList());
        return new MainUser( user.getUserName(), user.getEmail(), user.getPassword(), user.getName(), user.getRut(), user.getIdCliente(), user.getNombreDoc(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getRut() {
        return rut;
    }
    public String getNombreDoc() { return nombreDoc; }
    public Long getIdCliente() {
        return idCliente;
    }



}