package entities;

import javax.persistence.Table;

@Table
public class Person {
    int id;
    String name;
    String email;
    int age;
    String cpf;
    String birthdate;
}
