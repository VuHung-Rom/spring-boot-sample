package com.example.Hungvv.controller;

import com.example.Hungvv.entity.Customer;
import com.example.Hungvv.respository.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerRespository customerRespository;

    @GetMapping()
    List<Customer> all() {
        List<Customer> customerList = new ArrayList<>();
        customerRespository.findAll().forEach(customer -> customerList.add(customer));
        return customerList;

    }
    @GetMapping("/findCustomerBy/{customerid}")
    List<Customer> findCustomerBy(@PathVariable int customerid) {
        List<Customer> customerList = new ArrayList<>();
        customerRespository.findCustomerBy(customerid).forEach(customer -> customerList.add(customer));
        return customerList;
    }

    @GetMapping("/{id}")
    Customer get(@PathVariable int id) {
        return customerRespository.findById(id).get();
    }
    @PostMapping()
    Customer save(@RequestBody Customer customer ) {
        return customerRespository.save(customer);
    }
    @PutMapping()
    Customer update(@RequestBody Customer customer) {
        return customerRespository.save(customer);
    }
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
//
        customerRespository.deleteById(id);
//
    }
}
