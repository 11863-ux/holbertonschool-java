package com.example.jpah2demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Customer {

    @Id
    Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    List<Phone> phones;

    @OneToMany(cascade = CascadeType.ALL)
    List<Address> addresses;
}
