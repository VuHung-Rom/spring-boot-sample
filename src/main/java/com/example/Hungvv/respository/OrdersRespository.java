package com.example.Hungvv.respository;

import com.example.Hungvv.entity.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRespository extends CrudRepository <Orders,Integer> {
    @Query(nativeQuery = true, value = "SELECT * from ORDERS a where a.ordid like  :ordid")
    List<Orders> findOrdersBy(int ordid);
}