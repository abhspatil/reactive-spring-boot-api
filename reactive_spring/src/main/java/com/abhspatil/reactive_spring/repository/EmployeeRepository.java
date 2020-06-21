package com.abhspatil.reactive_spring.repository;

import com.abhspatil.reactive_spring.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
