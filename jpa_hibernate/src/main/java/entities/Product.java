package entities;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table
public class Product {
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

    @ManyToMany
    Person person;
}
