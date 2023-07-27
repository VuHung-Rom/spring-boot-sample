package com.example.Hungvv.respository;

import com.example.Hungvv.entity.Nhanvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface NhanVienRespository extends JpaRepository<Nhanvien, String> {

}
