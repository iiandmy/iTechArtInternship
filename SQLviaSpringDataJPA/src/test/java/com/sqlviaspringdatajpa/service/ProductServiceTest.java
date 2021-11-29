package com.sqlviaspringdatajpa.service;

import com.sqlviaspringdatajpa.model.Product;
import lombok.RequiredArgsConstructor;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RequiredArgsConstructor
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    private Product manipulateProduct;
    private Integer manipulateProductId;
    private final String manipulateProductName = "Keyboard";

    @BeforeEach
    public void init() {
        manipulateProduct = new Product(manipulateProductName, 120);
        productService.saveProduct(manipulateProduct);
        manipulateProductId = productService.findByName(manipulateProductName).getId();
    }

    @Test
    public void saveProduct() {
        assertEquals(productService.findByName(manipulateProductName), productService.saveProduct(manipulateProduct));
    }

    @Test
    void findById() {
        assertEquals(productService.findById(-1), new Product());
        assertEquals(manipulateProduct, productService.findById(manipulateProductId));
    }

    @Test
    void findAll() {
        List<Product> products = productService.findAll();
        assertEquals(6, products.size());
    }

    @Test
    void findByName() {
        assertEquals(manipulateProduct, productService.findByName(manipulateProductName));
        assertEquals(productService.findByName("no such keyboard"), new Product());
    }

    @Test
    public void deleteById() {
        productService.deleteById(manipulateProductId);
        assertEquals(productService.findById(manipulateProductId), new Product());
    }
}