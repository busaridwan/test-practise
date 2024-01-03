package com.busaridwan.testpractice.service;

import com.busaridwan.testpractice.dto.Response;
import com.busaridwan.testpractice.entity.Customer;
import com.busaridwan.testpractice.repository.CustomerRepository;
import com.busaridwan.testpractice.util.PhoneEmailValidator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@Slf4j
@SpringBootTest
class CustomerServiceTest {
    // Mock Dependencies
    @Mock
    private CustomerRepository repository;
    @Mock
    private PhoneEmailValidator validator;
    // Inject mocked dependencies in the test service
    @InjectMocks
    private CustomerService service;
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
        MockitoAnnotations.openMocks(this);
        log.info("Before each method");
    }

    @AfterEach
    void tearDown() {
        log.info("Tear down after each method");
    }

    @Test
    void saveCustomer() {
        log.info("save customer method");
        // Given
        Customer customer = Customer.builder().firstName("ridwan").username("busari").build();
        when(validator.isValidEmailFormat("ridwan@eco.ng")).thenReturn(true);
        when(repository.save(customer)).thenReturn(customer);
        // When
        ResponseEntity<Response> response = service.saveCustomer(customer);
        // Then
        assertEquals("000", response.getBody().getCode());
    }

    @Test
    void shouldCallRepositorySaveOnce(){
        Customer customer = Customer.builder().firstName("ridwan").username("busari").build();
        ResponseEntity<Response> response = service.saveCustomer(customer);
        verify(repository, times(1)).save(customer);
    }

    @Test
    void getAllCustomers() {
//        fail();
//        Given
        Customer customer = Customer.builder().firstName("ridwan").username("busari").build();
        List<Customer> customers = new ArrayList<>();
        when(repository.findAll()).thenReturn(customers);
//        When
        ResponseEntity<Response> response = service.getAllCustomers();
        List<Customer> responseCustomers = (List<Customer>) response.getBody().getData();
        assertEquals(customers.size(), responseCustomers.size());
        verify(repository, times(1)).findAll();
    }

    @Test
    void findCustomerById() {
    }

    @Test
    void updateCustomer() {
    }
}