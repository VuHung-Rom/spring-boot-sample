package com.example.Hungvv.service;

import com.example.Hungvv.entity.Product;
import com.example.Hungvv.respository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


import java.util.List;
@Service
@Validated
public class ProductService {

    @Autowired

    ProductRespository productRepository;

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }
    public Product getProductById(Long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid product ID");
        }
        return productRepository.findById(Math.toIntExact(id)).orElse(null);
    }

    public Product saveProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Invalid product ID");
        }
        // Thực hiện validation
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("Product price must be greater than zero");
        }
        if(product.getProductid() < 0){
            throw new IllegalArgumentException(" Id connot be null");
        }
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid product ID");
        }
        productRepository.deleteById(Math.toIntExact(id));
    }
}



