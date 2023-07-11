package com.example.Hungvv.controller;


import com.example.Hungvv.entity.Orders;
import com.example.Hungvv.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class OrderController {

    @Autowired
    OrderServiceImpl orderService;



    @GetMapping("/order")
    public List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Orders> getOrderById(@PathVariable Long id) {
       Orders order = orderService.getOrderById(id);
        if (order != null) {
            return ResponseEntity.ok(order);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/order")
    public ResponseEntity<Orders> addOrder(@RequestBody Orders order) {
        Orders saveOrder = orderService.saveOrder(order);
        return ResponseEntity.ok(saveOrder);
    }

    @PutMapping("/order/{id}")
    public ResponseEntity<Orders> updateOrder(@PathVariable Long id, @RequestBody Orders updateOrder) {
        Orders order = orderService.getOrderById(id);
        if (order != null) {
            updateOrder.setProductid(Math.toIntExact(id));
            Orders saveOrder = orderService.saveOrder(updateOrder);
            return ResponseEntity.ok(saveOrder);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Long id) {
        Orders order = orderService.getOrderById(id);
        if (order != null) {
            orderService.deleteOrder(id);
            return ResponseEntity.ok("Order deleted successfully.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
