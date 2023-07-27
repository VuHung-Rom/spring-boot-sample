package com.example.Hungvv.service;


import com.example.Hungvv.entity.Nguoidung;
import com.example.Hungvv.entity.Nhanvien;
import com.example.Hungvv.respository.NguoiDungRespository;
import com.example.Hungvv.respository.NhanVienRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.validation.annotation.Validated;


@Service
@Validated
public class NhanVienService {


    @Autowired
    private NhanVienRespository nhanvienRepository;

    public Nhanvien createNhanvien(Nhanvien nhanvien) {
        return nhanvienRepository.save(nhanvien);
    }

    public Nhanvien updateNhanvien(Nhanvien nhanvien) {
        return nhanvienRepository.save(nhanvien);
    }

    public List<Nhanvien> getAllNhanviens() {
        return nhanvienRepository.findAll();
    }

    public Nhanvien getNhanvienById(String id) {
        return nhanvienRepository.findById(id).orElse(null);
    }



}




