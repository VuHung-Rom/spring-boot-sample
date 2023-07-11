package com.example.Hungvv.service;

import com.example.Hungvv.entity.Product;
import com.example.Hungvv.respository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {


    @Autowired
    ProductRespository productRepository;

    public ProductService(ProductRespository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(Math.toIntExact(id)).orElse(null);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(Math.toIntExact(id));
    }


}

