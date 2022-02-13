package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}

