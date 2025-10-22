package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import io.swagger.annotations.Api;
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
    public ApiResponse<List<Product>> getAllProducts() {
        ApiResponse response=new ApiResponse();
        response.setData(productRepository.getAllProducts());
        response.setDescription("Warning - the process returned more than 1000 products.");
        response.setResponseCode(11);
        return response;
    }

    /**
     * Responsible for returning a product by its ID.
     */
    @GetMapping(value = "/findProductById/{id}")
    public ApiResponse<Product> getProductById(@PathVariable Long id) {
        ApiResponse response=new ApiResponse();
        response.setData(productRepository.getProductById(id));
        response.setDescription("The field id not informed. This information is required.");
        response.setResponseCode(12);
        return response;
    }

    /**
     * Responsible for adding a product.
     */
    @PostMapping(value = "/addProduct")
    public ApiResponse addProduct(@RequestBody Product p) {
        ApiResponse response=new ApiResponse();
        response.setDescription("Required fields not informed.");
        response.setResponseCode(10);
        return response;
    }

    /**
     * Responsible for updating a product.
     */
    @PutMapping(value = "/updateProduct")
    public ApiResponse updateProduct(@RequestBody Product p) {
        ApiResponse response=new ApiResponse();
        response.setDescription("No information has been updated. The new information is the same as recorded in the database.");
        response.setResponseCode(14);
        return response;
    }

    /**
     * Responsible for removing a product.
     */
    @DeleteMapping(value = "/removeProduct")
    public ApiResponse removeProduct(@RequestBody Product p) {
        ApiResponse response=new ApiResponse();
        response.setDescription("User not allowed to remove a product from this category.");
        response.setResponseCode(13);
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
