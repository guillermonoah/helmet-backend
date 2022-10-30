package com.portafolio.helmet.security.services;
import java.util.Optional;

import javax.transaction.Transactional;

import com.portafolio.helmet.security.repositories.RoleRepository;
import com.portafolio.helmet.security.entities.Role;
import com.portafolio.helmet.security.enums.RoleList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    public Optional<Role> getByRoleName(RoleList roleName){
        return roleRepository.findByRoleName(roleName);
    }
}
