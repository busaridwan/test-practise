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

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public ResponseEntity<Response> saveCustomer(Customer customer) {
        Response response = new Response();
        try {
            Optional<Customer> checkCustomer = repository.findByUsername(customer.getUsername());
            if (checkCustomer.isPresent()) {
                response.setCode(ResponseCodes.DUPLICATE)
                        .setMessage(ResponseMessages.DUPLICATE);
                return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
            }

            Customer dbResponse = repository.save(customer);
            response.setCode(ResponseCodes.SUCCESSFUL)
                    .setMessage(ResponseMessages.SUCCESSFUL)
                    .setData(dbResponse);
            return ResponseEntity.ok(response);

        } catch (Exception ex) {
            ex.printStackTrace();
            response.setMessage(ResponseMessages.FAILED)
                    .setCode(ResponseCodes.FAILED);
            return ResponseEntity.internalServerError().body(response);
        }

    }

    public ResponseEntity<Response> getAllCustomers() {
        Response response = new Response();
        try {
            List<Customer> dbResponse = repository.findAll();
            if (dbResponse.isEmpty()) {
                response.setCode(ResponseCodes.NOT_FOUND)
                        .setMessage(ResponseMessages.NOT_FOUND)
                        .setData(dbResponse);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
            }
            response.setData(dbResponse)
                    .setCode(ResponseCodes.SUCCESSFUL)
                    .setMessage(ResponseMessages.SUCCESSFUL);
            return ResponseEntity.ok(response);

        } catch (Exception ex) {
            ex.printStackTrace();
            response.setMessage(ResponseMessages.FAILED)
                    .setCode(ResponseCodes.FAILED);
            return ResponseEntity.internalServerError().body(response);
        }
    }

    public ResponseEntity<Response> findCustomerById(int id) {
        Response response = new Response();
        try {
            Optional<Customer> dbResponse = repository.findById(id);
            if (dbResponse.isPresent()) {
                response.setData(dbResponse)
                        .setCode(ResponseCodes.SUCCESSFUL)
                        .setMessage(ResponseMessages.SUCCESSFUL);
                return ResponseEntity.ok(response);
            }
            response.setCode(ResponseCodes.NOT_FOUND)
                    .setMessage(ResponseMessages.NOT_FOUND);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

        } catch (Exception ex) {
            ex.printStackTrace();
            response.setMessage(ResponseMessages.FAILED)
                    .setCode(ResponseCodes.FAILED);
            return ResponseEntity.internalServerError().body(response);
        }

    }

    public Optional<Customer> findCustomerByUsername(String username){
        return repository.findByUsername(username);
    }

    public ResponseEntity<Response> updateCustomer(int id, Customer customer) {
        Response response = new Response();
        try {
            Optional<Customer> dbResponse = repository.findById(id);
            if (dbResponse.isPresent()) {
//                repository.update(customer);
                response.setData(dbResponse)
                        .setCode(ResponseCodes.SUCCESSFUL)
                        .setMessage(ResponseMessages.SUCCESSFUL);
                return ResponseEntity.ok(response);
            }
            response.setCode(ResponseCodes.NOT_FOUND)
                    .setMessage(ResponseMessages.NOT_FOUND);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

        } catch (Exception ex) {
            ex.printStackTrace();
            response.setMessage(ResponseMessages.FAILED)
                    .setCode(ResponseCodes.FAILED);
            return ResponseEntity.internalServerError().body(response);
        }
    }
}
