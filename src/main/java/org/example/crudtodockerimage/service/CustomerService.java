package org.example.crudtodockerimage.service;

import lombok.RequiredArgsConstructor;
import org.example.crudtodockerimage.models.Customer;
import org.example.crudtodockerimage.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
