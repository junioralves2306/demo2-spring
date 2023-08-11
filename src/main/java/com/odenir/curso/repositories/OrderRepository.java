package com.odenir.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odenir.curso.entities.Order;

//@Repository é opcional neste caso pois a classe já herda a anotação do JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
