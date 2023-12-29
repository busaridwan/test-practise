package com.busaridwan.testpractice.repository;

import com.busaridwan.testpractice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findCustomerByUsername(String username);
}
