package com.example.Hungvv.respository;

import com.example.Hungvv.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRespository extends CrudRepository<Customer, Integer> {
    @Query(nativeQuery = true,value = "SELECT * from Customer a where a.customerid like :customerid")
    List<Customer> findCustomerBy (int customerid);
}
