package com.odenir.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odenir.curso.entities.Category;
import com.odenir.curso.entities.Product;

//@Repository é opcional neste caso pois a classe já herda a anotação do JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
