package org.example.crudtodockerimage.repository;

import org.example.crudtodockerimage.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
