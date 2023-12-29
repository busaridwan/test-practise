//package com.busaridwan.testpractice.integration;
//
//import com.busaridwan.testpractice.entity.Customer;
//import lombok.RequiredArgsConstructor;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.web.client.RestTemplate;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CustomerIntegrationTest {
//    @LocalServerPort
//    private int port;
//    private String baseUrl = "http://localhost";
//    private static RestTemplate restTemplate;
//    private TestCustomerRepository repository;
//
//    @BeforeAll
//    public static void init() {
//        restTemplate = new RestTemplate();
//    }
//
//    @BeforeEach
//    public void setUp() {
//        baseUrl = baseUrl.concat(":").concat(port + "").concat("/customer");
//    }
//
//    @Test
//    public void testRegisterCustomer() {
//        Customer customer = new Customer("Ridwan", "Busari");
//        Customer dbCustomer = restTemplate.postForObject(baseUrl, customer, Customer.class);
//        assert dbCustomer != null;
//        assertEquals("Ridwan", dbCustomer.getUsername());
//        assertEquals(1, repository.findAll().size());
//    }
//}
