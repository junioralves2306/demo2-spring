package com.odenir.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odenir.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
