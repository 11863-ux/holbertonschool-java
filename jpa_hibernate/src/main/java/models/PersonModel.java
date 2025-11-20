package models;

import entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PersonModel {
    public void create(Person p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting transaction");
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            System.out.println("Person created successfully!");
        } catch (Exception e) {
            em.close();
            System.err.println("Error creating Person: " + e.getMessage());
        } finally {
            em.close();
            System.out.println("Transaction completed");
        }
    }

    public void update(Person p) {
        //TODO
    }

    public void delete(Person p) {
        //TODO
    }

    public Person findById(Person p) {
        //TODO
        return null;
    }

    public List<Person> findAll() {

        List<Person> Persons = new ArrayList<Person>();
        //TODO
        return null;
    }
    
}
