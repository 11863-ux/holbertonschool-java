package entities;

import javax.persistence.Table;

@Table
public class Product {
    int id;
    String name;
    int quantity;
    int price;
    String status;
}
