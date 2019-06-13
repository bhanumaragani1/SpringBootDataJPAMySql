package com.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starter.model.Product;

public interface ProductRepsitory extends JpaRepository<Product, Integer>{

}
