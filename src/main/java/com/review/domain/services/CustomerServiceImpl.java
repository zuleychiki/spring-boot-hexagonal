package com.review.domain.services;

import com.review.domain.model.Customer;
import com.review.domain.port.CustomerPort;
import com.review.domain.services.interfaces.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    // Injection
    /*
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return null;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer editCustomer(Customer customer) {
        return null;
    }

    @Override
    public void deleteCustomer(int customerId) {
    }

     */

    private final CustomerPort customerPort;

    @Override
    public List<Customer> getCustomers() {
        return customerPort.getAllCustomers();
    }

    @Override
    public Customer editCustomer(Customer customer) {
        return customerPort.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        customerPort.deleteCustomer(customerId);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerPort.saveCustomer(customer);
    }

}
