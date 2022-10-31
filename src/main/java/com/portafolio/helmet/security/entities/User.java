/* package com.portafolio.helmet.security.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.management.relation.Role;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NaturalId
    @Column(unique = true)
    private String userName;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "last_name")
    @NotNull
    private String lastName;
    @NotNull
    @Email
    @Column(length = 100)
    private String email;
    @NotNull
    private String password;
    @NotNull
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="user_role_relate", joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns=@JoinColumn(name="role_id"))
    private Set<Role> roles = new HashSet<>();

    @Null
    @Column(name = "rut", length = 15)
    private String rut;

    public User() {
    }

    public User(@NotNull String userName, @NotNull String email, @NotNull String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public void setRoles(Set<com.portafolio.helmet.security.entities.Role> roles) {
    }
}*/

package com.portafolio.helmet.security.entities;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.management.relation.Role;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NaturalId
    @Column(unique = true)
    private String userName;

    @NotNull
    @Column(name = "idProfile")
    private Long idProfile;

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

    @Null
    @Column(name = "phoneNumber")
    private String phoneNumber;

    public User(){}

    public User (@NotNull String userName, @NotNull String email, @NotNull String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public void setRoles(Set<com.portafolio.helmet.security.entities.Role> roles) {
    }
}
