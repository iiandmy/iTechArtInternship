package com.sqlviaspringdatajpa.service;

import com.sqlviaspringdatajpa.model.Product;
import com.sqlviaspringdatajpa.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product findById(Integer id) {
        return productRepository.findById(id).orElse(new Product());
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findByName(String name) {
        return productRepository.existsProductByProductName(name) ?
                productRepository.findProductByProductName(name) :
                new Product();
    }

    public Product saveProduct(Product product) {
        return productRepository.existsProductByProductName(product.getProductName()) ?
                productRepository.findProductByProductName(product.getProductName()) :
                productRepository.save(product);
    }

    public void deleteById(Integer id) {
        if (productRepository.existsById(id) == false)
            throw new RuntimeException("No product with such id " + id);
        productRepository.deleteById(id);
    }

}
