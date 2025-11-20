package entities;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue
    @Column
    int id;
    @Column
    String name;
    @Column
    int quantity;
    @Column
    int price;
    @Column
    String status;

    @ManyToOne
    Person person;
}
