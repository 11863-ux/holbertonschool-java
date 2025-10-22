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

    @GetMapping(value = "/allProducts")
    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }

    @GetMapping(value = "/findProductById/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.getProductById(id);
    }

    @PostMapping(value = "/addProduct")
    public void addProduct(Product p) {
        productRepository.addProduct(p);
    }


    @PutMapping(value = "/updateProduct")
    public void updateProduct(Product p) {
        productRepository.updateProduct(p);
    }

    @DeleteMapping(value = "/removeProduct")
    public void removeProduct(Product p) {
        productRepository.removeProduct(p);
    }


    @PostMapping(value = "/addList")
    public void addList(List<Product> listOfProducts) {
        productRepository.addList(listOfProducts);
    }
}
