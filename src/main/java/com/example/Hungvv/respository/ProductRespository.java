package com.example.Hungvv.respository;

import com.example.Hungvv.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRespository extends CrudRepository<Product, Integer> {

    /**
     * jpql
     * @param productid
     * @return
     */
    @Query(nativeQuery = true, value = "SELECT * from Product a where a.productid like  :productid")
    List<Product> findProductBy(int productid);

    List<Product> findProductByNameAndPrice(String name, int price);

    /**
     * kiểu findby
     * @param price
     * @return
     */
    List<Product> findProductByPriceGreaterThan( int price);
}
