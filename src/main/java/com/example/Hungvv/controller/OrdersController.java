package com.example.Hungvv.controller;


import com.example.Hungvv.entity.Orders;
import com.example.Hungvv.respository.OrdersRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
public class OrdersController {
    @Autowired
    OrdersRespository ordersRespository;

    @GetMapping("/Orders")
    List<Orders> all() {
        List<Orders> ordersList = new ArrayList<>();
       ordersRespository.findAll().forEach(orders -> ordersList.add(orders));
        return ordersList;

    }
    @GetMapping("/Orders/findOrdersBy/{ordid}")
    List<Orders> findOrdersBy(@PathVariable int ordid) {
        List<Orders> ordersList = new ArrayList<>();
        ordersRespository.findOrdersBy(ordid).forEach(orders -> ordersList.add(orders));
        return ordersList;
    }

    @GetMapping("/Orders/{id}")
    Orders get(@PathVariable int id) {
        return ordersRespository.findById(id).get();

    }
    @PostMapping("/Orders")
    Orders save(@RequestBody Orders orders ) {
        return ordersRespository.save(orders);
    }
    @PutMapping("/Orders")
    Orders update(@RequestBody Orders orders) {
        return ordersRespository.save(orders);
    }
    @DeleteMapping("/Orders/{id}")
    void delete(@PathVariable Integer id) {
//
        ordersRespository.deleteById(id);
//
    }


}
