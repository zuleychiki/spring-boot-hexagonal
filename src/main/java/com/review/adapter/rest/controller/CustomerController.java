package com.review.adapter.rest.controller;

import com.review.adapter.rest.dto.out.CustomerResponse;
import com.review.adapter.rest.mapper.CustomerDtoMapper;
import com.review.domain.model.Customer;
import com.review.domain.services.interfaces.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1")
public class CustomerController {

    /*
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerEntity> getCustomers() {
        return customerService.getCustomers();
    }
     */

    CustomerDtoMapper customerDtoMapper;

    @Autowired
    private CustomerService customerService; // Interfaz del caso de uso

    @GetMapping("/customers")
    public ResponseEntity<List<CustomerResponse>> getCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        List<CustomerResponse> response = customers.stream()
                .map(customerDtoMapper::toCustomerResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/customer")
    public ResponseEntity<CustomerResponse> createCustomer(Customer customer) {
        Customer createdCustomer = customerService.createCustomer(customer);
        CustomerResponse response = customerDtoMapper.toCustomerResponse(createdCustomer);
        return ResponseEntity.ok(response);
    }
}
