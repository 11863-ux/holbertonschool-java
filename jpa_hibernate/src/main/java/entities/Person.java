package entities;

import javax.persistence.Column;
import javax.persistence.Table;

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
}
