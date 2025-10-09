package models;

import entities.Student;

import java.util.List;

public class StudentModel {

    public void create(Student student) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("course-management-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting transaction");
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            System.out.println("Student created successfully!!!");
        } catch (Exception e) {
            em.close();
            System.err.println("Error creating student!!! " + e.getMessage());
        } finally {
            em.close();
            System.out.println("Ending transaction");
        }
    }

    public Student findById(Long id) {
        // TODO
        return null;
    }

    public List<Student> findAll() {
        // TODO
        return null;
    }

    public void update(Student student) {
        // TODO
    }

    public void delete(Student student) {
        // TODO
    }
}
