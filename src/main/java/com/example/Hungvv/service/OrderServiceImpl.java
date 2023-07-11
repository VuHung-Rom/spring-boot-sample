package com.example.Hungvv.service;

import com.example.Hungvv.entity.Orders;
import com.example.Hungvv.respository.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl {
    @Autowired
    OrderRespository orderRepository;


    public List<Orders> getAllOrders() {
        return (List<Orders>) orderRepository.findAll();
    }

    public Orders getOrderById(Long id) {
        return orderRepository.findById(Math.toIntExact(id)).orElse(null);
    }

    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(Math.toIntExact(id));
    }

}
