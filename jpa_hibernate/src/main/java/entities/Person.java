package entities;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table
public class Person {
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

    @OneToMany
    List<Product> products;
}
