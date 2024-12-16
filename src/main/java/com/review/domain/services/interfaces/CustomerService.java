package com.review.domain.services.interfaces;


import com.review.domain.model.Customer;

import java.util.List;

public interface CustomerService {

    public Customer createCustomer(Customer customer);

    public List<Customer> getAllCustomers();

    public Customer editCustomer(Customer customer);

    public void deleteCustomer(Long customerId);
}
