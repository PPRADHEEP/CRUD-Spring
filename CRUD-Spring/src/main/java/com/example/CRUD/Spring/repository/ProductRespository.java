package com.example.CRUD.Spring.repository;

import com.example.CRUD.Spring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends JpaRepository<Product, Long> {

    Product findByName(String name);
}
