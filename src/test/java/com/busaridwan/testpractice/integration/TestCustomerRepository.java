package com.busaridwan.testpractice.integration;

import com.busaridwan.testpractice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TestCustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findCustomerByUsername(String username);
}
