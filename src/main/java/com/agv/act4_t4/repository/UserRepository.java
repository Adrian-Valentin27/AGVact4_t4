package com.agv.act4_t4.repository;

import com.agv.act4_t4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    
    // Método para buscar al usuario por su nombre al hacer login
    Optional<User> findByUsername(String username);
}