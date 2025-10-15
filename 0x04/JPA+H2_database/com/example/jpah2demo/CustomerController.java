package com.example.jpah2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/addClient")
    public ResponseEntity<Customer> addClient(@RequestBody Customer customer) {
        // TODO
    }

    @GetMapping("/findAllClients")
    public ResponseEntity<List<Customer>> findAllClients() {
        // TODO
    }

    @GetMapping("/findClientById/{id}")
    public ResponseEntity<Customer> findClientById(@PathVariable("id") Long idClient) {
        // TODO
    }

    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeCustomer(@PathVariable("id") Long idClient){
        // TODO
    }

    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("id") Long id, @RequestBody Customer customer){
        // TODO
    }
}
