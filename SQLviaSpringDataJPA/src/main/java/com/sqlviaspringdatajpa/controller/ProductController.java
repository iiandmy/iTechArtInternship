package com.sqlviaspringdatajpa.controller;

import com.sqlviaspringdatajpa.model.Product;
import com.sqlviaspringdatajpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService userService) {
        this.productService = userService;
    }

    @GetMapping("/products")
    public String findAll(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "product-list";
    }

    @GetMapping("/product-create")
    public String createProductForm(Product product) {
        return "product-create";
    }

   @PostMapping("/product-create")
   public String createProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
   }

   @GetMapping("product-delete/{id}")
   public String deleteUser(@PathVariable("id") Integer id) {
        productService.deleteById(id);
        return "redirect:/products";
   }

   @GetMapping("product-update/{id}")
   public String updateUserForm(@PathVariable("id") Integer id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "product-update";
   }

   @PostMapping("product-update")
   public String updateUser(Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
   }
}
