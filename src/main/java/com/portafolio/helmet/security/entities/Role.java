package com.portafolio.helmet.security.entities;

import lombok.Getter;
import lombok.Setter;

import javax.management.relation.RoleList;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role {
        @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roleid_generator")
//    @SequenceGenerator(name = "roleid_generator", initialValue = 1, allocationSize = 1, sequenceName = "roleid_seq")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotNull
        @Enumerated(EnumType.STRING)
        @Column(name = "name")
        private RoleList roleName;
        public Role() {
        }
        public Role(@NotNull RoleList roleName) {
            this.roleName = roleName;
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public RoleList getRoleName() {
            return roleName;
        }
        public void setRoleName(RoleList roleName) {
            this.roleName = roleName;
        }
}
