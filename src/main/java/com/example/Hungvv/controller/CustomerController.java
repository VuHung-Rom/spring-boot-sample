package com.example.Hungvv.controller;

import com.example.Hungvv.entity.Customer;
import com.example.Hungvv.respository.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class CustomerController {
    @Autowired
    CustomerRespository customerRespository;

    @GetMapping("/Customer")
    List<Customer> all() {
        List<Customer> customerList = new ArrayList<>();
        customerRespository.findAll().forEach(customer -> customerList.add(customer));
        return customerList;

    }
    @GetMapping("/Customer/findCustomerBy/{customerid}")
    List<Customer> findCustomerBy(@PathVariable int customerid) {
        List<Customer> customerList = new ArrayList<>();
        customerRespository.findCustomerBy(customerid).forEach(customer -> customerList.add(customer));
        return customerList;
    }

    @GetMapping("/Customer/{id}")
    Customer get(@PathVariable int id) {
        return customerRespository.findById(id).get();

    }
    @PostMapping("/Customer")
    Customer save(@RequestBody Customer customer ) {
        return customerRespository.save(customer);
    }
    @PutMapping("/Customer")
    Customer update(@RequestBody Customer customer) {
        return customerRespository.save(customer);
    }
    @DeleteMapping("/Customer/{id}")
    void delete(@PathVariable Integer id) {
//
        customerRespository.deleteById(id);
//
    }
}
