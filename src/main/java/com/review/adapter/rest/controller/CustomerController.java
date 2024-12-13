package com.review.adapter.rest.controller;

import com.review.adapter.rest.dto.out.CustomerResponse;
import com.review.adapter.rest.mapper.CustomerDtoMapper;
import com.review.infra.database.entities.CustomerEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("api/v1/customers")
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

    @GetMapping
    public List<CustomerResponse> getCustomers() {
        return null;
    }
}
