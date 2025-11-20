package models;

import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {
    public void create(Product p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting transaction");
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            System.out.println("Product created successfully!");
        } catch (Exception e) {
            em.close();
            System.err.println("Error creating product: " + e.getMessage());
        } finally {
            em.close();
            System.out.println("Transaction completed");
        }
    }

    public void update(Product p) {
        //TODO
    }

    public void delete(Product p) {
        //TODO
    }

    public Product findById(Product p) {
        //TODO
        return null;
    }

    public List<Product> findAll() {

        List<Product> products = new ArrayList<Product>();
        //TODO
        return null;
    }
}
