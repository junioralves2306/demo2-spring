package com.odenir.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odenir.curso.entities.User;

//@Repository é opcional neste caso pois a classe já herda a anotação do JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
