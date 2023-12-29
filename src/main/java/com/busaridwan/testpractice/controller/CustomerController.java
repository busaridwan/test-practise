package com.busaridwan.testpractice.controller;

import com.busaridwan.testpractice.entity.Customer;
import com.busaridwan.testpractice.dto.Response;
import com.busaridwan.testpractice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService service;

    public ResponseEntity<Response> registerCustomer(@RequestBody Customer customer){
        return service.saveCustomer(customer);
    }
}
