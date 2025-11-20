package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    int id;
    @Column
    String name;
    @Column
    String email;
    @Column
    int age;
    @Column
    String cpf;
    @Column
    String birthdate;

    @OneToMany(mappedBy = "person")
    List<Product> products;
}
