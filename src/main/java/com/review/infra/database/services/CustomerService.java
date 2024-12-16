package com.review.infra.database.services;

import com.review.domain.model.Customer;
import com.review.domain.port.CustomerPort;
import com.review.infra.database.mapper.CustomerMapper;
import com.review.infra.database.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CustomerService implements CustomerPort {

    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll().stream()
                .map(customerMapper::customerToCustomerEntity)
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return null;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }

    @Override
    public void deleteCustomer(Long customerId) {

    }
}
