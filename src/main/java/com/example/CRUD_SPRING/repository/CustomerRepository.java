package com.example.CRUD_SPRING.repository;

import com.example.CRUD_SPRING.modeles.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer , Long> {
}
