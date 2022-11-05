package com.portafolio.helmet.security.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor

public class User {


    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userid_generator")
//    @SequenceGenerator(name = "userid_generator", initialValue = 1, allocationSize = 1, sequenceName = "userid_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @NotNull
    private Long idProfile;
    @Id
    @Null
    private Long idBusiness;

    @NotNull
    @NaturalId
    @Column(unique = true)
    private String userName;
    @NotNull
    private String password;

    @NotNull
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="user_role_relate", joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns=@JoinColumn(name="role_id"))
    private Set<Role> roles = new HashSet<>();

    @Column(name = "name")
    @NotNull
    private String name;
    @Null
    @Column(name = "rut", length = 15)
    private String rut;
    @NotNull
    @Email
    @Column(length = 100)
    private String email;

/*
    private Long id;
    private Long idPerfil;
    private Long idEmpresa;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String rut;
    private String email;
    private String telefono;
    */


    public User() {
    }

    public User(@NotNull String userName, @NotNull String email, @NotNull String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

}