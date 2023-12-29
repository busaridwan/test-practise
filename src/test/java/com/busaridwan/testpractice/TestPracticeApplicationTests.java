package com.busaridwan.testpractice;

import com.busaridwan.testpractice.entity.Customer;
import com.busaridwan.testpractice.integration.TestCustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
class TestPracticeApplicationTests {

//    @Test
//    void contextLoads() {
//    }

    @LocalServerPort
    private int port;
    private String baseUrl = "http://localhost";
    private static RestTemplate restTemplate;
    private TestCustomerRepository repository;

    @BeforeAll
    public static void init() {
        restTemplate = new RestTemplate();
    }

    @BeforeEach
    public void setUp() {
        baseUrl = baseUrl.concat(":").concat(port + "").concat("/customer");
    }

    @Test
    public void testRegisterCustomer() {
        Customer customer = new Customer(1L,"Ridwan", "Busari");
        log.info("baseUrl: " + baseUrl);
        Customer dbCustomer = restTemplate.postForObject(baseUrl, customer, Customer.class);
        log.info("dbCustomer {}", dbCustomer);
        assert dbCustomer != null;
        assertEquals("Ridwan", dbCustomer.getUsername());
        assertEquals(1, repository.findAll().size());
    }

}
