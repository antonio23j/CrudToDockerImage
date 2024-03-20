package org.example.crudtodockerimage.service;

import lombok.RequiredArgsConstructor;
import org.example.crudtodockerimage.models.Customer;
import org.example.crudtodockerimage.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public ResponseEntity<String> createCustomer(Customer customer) {
        customerRepository.insert(customer);
        return ResponseEntity.ok("Customer created successfully");
    }

    public ResponseEntity<String> updateCustomer(Customer customer) {
        customerRepository.save(customer);
        return ResponseEntity.ok("Customer updated successfully");
    }
}
