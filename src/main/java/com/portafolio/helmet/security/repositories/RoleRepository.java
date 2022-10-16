package com.portafolio.helmet.security.repositories;

import com.portafolio.helmet.security.entities.Role;
import com.portafolio.helmet.security.enums.RoleList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(RoleList roleName);
}
