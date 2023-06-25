package com.example.Hungvv.controller;

import com.example.Hungvv.entity.Orders;
import com.example.Hungvv.entity.Product;
import com.example.Hungvv.respository.OrdersRespository;
import com.example.Hungvv.respository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class ProductController {
    @Autowired
    ProductRespository productRespository;

    @GetMapping("/Product")
    List<Product> all() {
        List<Product> productList = new ArrayList<>();
        productRespository.findAll().forEach(product -> productList.add(product));
        return productList;

    }
    @GetMapping("/Product/findProductBy/{productid}")
    List<Product> findProductBy(@PathVariable int productid) {
        List<Product> productList = new ArrayList<>();
        productRespository.findProductBy(productid).forEach(product -> productList.add(product));
        return productList;
    }

    @GetMapping("/Product/{id}")
    Product get(@PathVariable int id) {
        return productRespository.findById(id).get();

    }
    @PostMapping("/Product")
    Product save(@RequestBody Product product ) {
        return productRespository.save(product);
    }
    @PutMapping("/Product")
    Product update(@RequestBody Product product) {
        return productRespository.save(product);
    }
    @DeleteMapping("/Product/{id}")
    void delete(@PathVariable Integer id) {
//
        productRespository.deleteById(id);
//
    }
}
