package com.odenir.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odenir.curso.entities.OrderItem;

//@Repository é opcional neste caso pois a classe já herda a anotação do JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
