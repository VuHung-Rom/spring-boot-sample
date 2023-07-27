package com.example.Hungvv.service;

import com.example.Hungvv.entity.Customer;
import com.example.Hungvv.respository.CustomerRespository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    private final CustomerRespository customerRepository;

    public CustomerService(CustomerRespository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(Math.toIntExact(id)).orElse(null);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(Math.toIntExact(id));
    }

}

