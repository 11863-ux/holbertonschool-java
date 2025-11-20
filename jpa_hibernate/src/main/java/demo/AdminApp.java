package demo;

import entities.Product;
import models.ProductModel;

import java.util.List;

public class AdminApp {
    public static void main(String[] args) {
        ProductModel productModel = new ProductModel();

        Product p1 = new Product();
        p1.setName("TV");
        p1.setPrice(300.0);
        p1.setQuantity(100);
        p1.setStatus(true);

        // 1) Creating a product
        productModel.create(p1);

        // 2) Fetching all products from the database
        List<Product> products = productModel.findAll();
        System.out.println("Number of products found: " + products.size());

        // TODO - Test other methods of the ProductModel and PersonModel classes

    }
}
