package com.sqlviaspringdatajpa.repository;

import com.sqlviaspringdatajpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select (count(p) > 0) from Product p where p.productName = ?1")
    boolean existsProductByProductName(String name);

    @Query("select p from Product p where p.productName = ?1")
    Product findProductByProductName(String name);
}
