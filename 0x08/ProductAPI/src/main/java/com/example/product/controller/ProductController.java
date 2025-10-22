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
     * Custom Code 11: More than 1000 products.
     */
    @GetMapping(value = "/allProducts")
    public ApiResponse<List<Product>> getAllProducts() {
        List<Product> products = productRepository.getAllProducts();
        ApiResponse<List<Product>> response = new ApiResponse<>();
        response.setData(products);

        if (products.size() > 1000) {
            // code = 11
            response.setResponseCode(11);
            response.setDescription("Warning - the process returned more than 1000 products.");
        } else {
            response.setResponseCode(200);
            response.setDescription("OK");
        }

        return response;
    }

    /**
     * Responsible for returning a product by its ID.
     * Custom Code 12: ID not informed.
     */
    @GetMapping(value = "/findProductById/{id}")
    public ApiResponse<Product> getProductById(@PathVariable(required = false) Long id) {
        ApiResponse<Product> response = new ApiResponse<>();

        if (id == null) {
            // code = 12
            response.setResponseCode(12);
            response.setDescription("The field id not informed. This information is required.");
            response.setData(null);
            return response;
        }

        Product product = productRepository.getProductById(id);

        if (product == null) {
            response.setResponseCode(404);
            response.setDescription("Product not found.");
            response.setData(null);
        } else {
            response.setResponseCode(200);
            response.setDescription("OK");
            response.setData(product);
        }

        return response;
    }

    /**
     * Responsible for adding a product.
     * Custom Code 10: Required fields not informed.
     */
    @PostMapping(value = "/addProduct")
    public ApiResponse<Void> addProduct(@RequestBody Product p) {
        ApiResponse<Void> response = new ApiResponse<>();

        if (p == null || p.getName() == null || p.getCategory() == null) {
            // code = 10
            response.setResponseCode(10);
            response.setDescription("Required fields not informed.");
            return response;
        }

        productRepository.addProduct(p);
        response.setResponseCode(201);
        response.setDescription("Product added successfully.");
        return response;
    }

    /**
     * Responsible for updating a product.
     * Custom Code 14: No information updated.
     */
    @PutMapping(value = "/updateProduct")
    public ApiResponse<Void> updateProduct(@RequestBody Product p) {
        ApiResponse<Void> response = new ApiResponse<>();
        Product existing = productRepository.getProductById(p.getId());

        if (existing != null && existing.equals(p)) {
            // code = 14
            response.setResponseCode(14);
            response.setDescription("No information has been updated. The new information is the same as recorded in the database.");
            return response;
        }

        productRepository.updateProduct(p);
        response.setResponseCode(200);
        response.setDescription("Product updated successfully.");
        return response;
    }

    /**
     * Responsible for removing a product.
     * Custom Code 13: Not allowed to remove from category.
     */
    @DeleteMapping(value = "/removeProduct")
    public ApiResponse<Void> removeProduct(@RequestBody Product p) {
        ApiResponse<Void> response = new ApiResponse<>();

        if ("Restricted".equalsIgnoreCase(p.getCategory())) {
            // code = 13
            response.setResponseCode(13);
            response.setDescription("User not allowed to remove a product from this category.");
            return response;
        }

        productRepository.removeProduct(p);
        response.setResponseCode(200);
        response.setDescription("Product removed successfully.");
        return response;
    }

    /**
     * WELCOME TO THE PRODUCT REST API.
     */
    @GetMapping(value = "/welcome")
    public String welcome() {
        return "Welcome to the product API!";
    }
}
