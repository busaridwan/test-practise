package com.busaridwan.testpractice.service;

import com.busaridwan.testpractice.dto.Response;
import com.busaridwan.testpractice.entity.Customer;
import com.busaridwan.testpractice.enums.ResponseMessages;
import com.busaridwan.testpractice.repository.CustomerRepository;
import com.busaridwan.testpractice.util.ResponseCodes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public ResponseEntity<Response> saveCustomer(Customer customer){
        Response response = new Response();
        try {
            Optional<Customer> checkCustomer = repository.findCustomerByUsername(customer.getUsername());
            if (checkCustomer.isPresent()){
                response.setCode(ResponseCodes.DUPLICATE)
                        .setMessage(ResponseMessages.DUPLICATE);
                return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
            }

            Customer dbResponse = repository.save(customer);
            response.setCode(ResponseCodes.SUCCESSFUL)
                    .setMessage(ResponseMessages.SUCCESSFUL)
                    .setData(dbResponse);
            return ResponseEntity.ok(response);

        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(response);
        }

    }
}
