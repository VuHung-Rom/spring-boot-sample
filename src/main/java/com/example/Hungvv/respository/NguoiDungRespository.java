package com.example.Hungvv.respository;


import com.example.Hungvv.entity.Nguoidung;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NguoiDungRespository extends CrudRepository<Nguoidung, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM NguoiDung a WHERE a.Ten LIKE :ten")
    List<Nguoidung> findNguoiDungByName(@Param("ten") String ten);



}
