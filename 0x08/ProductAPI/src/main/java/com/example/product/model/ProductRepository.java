package com.example.product.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> list = new ArrayList<Product>();

    public List<Product> getAllProducts() {
        // TODO Implement
    }

    public Product getProductById(Long id) {
        // TODO Implement
    }

    public void addProduct(Product p) {
        // TODO Implement
    }

    public void updateProduct(Product p) {
        // TODO Implement
    }

    public void removeProduct(Product p) {
        // TODO Implement
    }

    public void addList(List<Product> listOfProducts) {
        // TODO Implement
    }
}
