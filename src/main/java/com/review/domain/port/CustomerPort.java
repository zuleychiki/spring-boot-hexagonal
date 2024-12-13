package com.review.domain.port;

import com.review.domain.model.Customer;

import java.util.List;

public interface CustomerPort {

    public List<Customer> getAllCustomers();

    public Customer getCustomerById(Long customerId);

    public Customer saveCustomer(Customer customer);

    public Customer updateCustomer(Customer customer);

    public void deleteCustomer(Long customerId);
}
