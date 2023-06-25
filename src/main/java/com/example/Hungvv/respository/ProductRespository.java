package com.example.Hungvv.respository;

import com.example.Hungvv.entity.Orders;
import com.example.Hungvv.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRespository extends CrudRepository<Product, Integer> {

    @Query(nativeQuery = true, value = "SELECT * from Product a where a.productid like  :productid")
    List<Product> findProductBy(int productid);

}
