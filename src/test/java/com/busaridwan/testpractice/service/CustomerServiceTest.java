package com.busaridwan.testpractice.service;

import com.busaridwan.testpractice.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class CustomerServiceTest {
    @Autowired
    CustomerService service;
    @BeforeAll
    static void beforeAll() {
        log.info("Before class");
    }

    @AfterAll
    static void afterAll() {
        log.info("After class");
    }

    @BeforeEach
    void setUp(){
        log.info("Before each method");
    }

    @AfterEach
    void tearDown() {
        log.info("Tear down after each method");
    }

    @Test
    void saveCustomer() {
        log.info("save customer method");
        Customer customer = Customer.builder().firstName("ridwan").username("busari").build();
        service.saveCustomer(customer);
        Optional<Customer> dbCustomer = service.findCustomerByUsername("busari");
        if (dbCustomer.isEmpty()){
            fail("save customer method failed");
        }else {
            log.info("new customer : {}", dbCustomer);
            String username = dbCustomer.get().getUsername();
            assertEquals(username, "busari");
            assertEquals(1L, dbCustomer.get().getId());
        }

    }

    @Test
    void getAllCustomers() {
//        fail();
    }

    @Test
    void findCustomerById() {
    }

    @Test
    void updateCustomer() {
    }
}