package com.example.Hungvv.respository;

import com.example.Hungvv.entity.Congty;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CongTyRespository extends CrudRepository<Congty, Integer> {
    @Query(nativeQuery = true,value = "SELECT * from Congty a where a.mact like :mact")
    List<Congty> findCongtyByMact(@Param("mact") String mact);

    boolean existsByTenct(String tenct);
}
