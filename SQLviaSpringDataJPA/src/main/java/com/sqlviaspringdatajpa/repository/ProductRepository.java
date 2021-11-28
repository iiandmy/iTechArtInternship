package com.sqlviaspringdatajpa.repository;

import com.sqlviaspringdatajpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
