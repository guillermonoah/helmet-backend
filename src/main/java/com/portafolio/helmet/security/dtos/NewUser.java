package com.portafolio.helmet.security.dtos;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewUser {

    @NotBlank
    private Long idProfile;
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    @NotBlank
    private String name;
    @NotBlank
    private String rut;
    @NotBlank
    private String email;
    @NotBlank
    private String phoneNumber;

    private Set<String> roles = new HashSet<>();


}
