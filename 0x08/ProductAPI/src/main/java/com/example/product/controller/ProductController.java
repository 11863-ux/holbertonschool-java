package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    /**
     * Responsible for returning a list of products.
     */
    @GetMapping(value = "/allProducts")
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    /**
     * Responsible for returning a product by its ID.
     */
    @GetMapping(value = "/findProductById/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.getProductById(id);
    }

    /**
     * Responsible for adding a product.
     */
    @PostMapping(value = "/addProduct")
    public void addProduct(@RequestBody Product p) {
        productRepository.addProduct(p);
    }

    /**
     * Responsible for updating a product.
     */
    @PutMapping(value = "/updateProduct")
    public void updateProduct(@RequestBody Product p) {
        productRepository.updateProduct(p);
    }

    /**
     * Responsible for removing a product.
     */
    @DeleteMapping(value = "/removeProduct")
    public void removeProduct(@RequestBody Product p) {
        productRepository.removeProduct(p);
    }

    /**
     * WELCOME TO THE PRODUCT REST API.
     */
    @GetMapping(value = "/welcome")
    public String welcome() {
        return "Welcome to the product API!";
    }
}
