package com.portafolio.helmet.security.repositories;

import com.portafolio.helmet.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
    Optional<User> findUserById(Long id);
    Optional<User> findUserByEmail(String email);
    boolean existsByUserName(String userName);
}