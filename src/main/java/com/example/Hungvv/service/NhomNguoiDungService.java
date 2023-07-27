package com.example.Hungvv.service;



import com.example.Hungvv.entity.Nhomnguoidung;
import com.example.Hungvv.respository.NhomNguoiDungRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhomNguoiDungService {
    @Autowired
    private NhomNguoiDungRespository nhomNguoiDungRespository;

    public Nhomnguoidung createNhomNguoiDung(Nhomnguoidung nhomnguoidung) {
        return nhomNguoiDungRespository.save(nhomnguoidung);
    }

    public Nhomnguoidung updateNhomNguoiDung(Nhomnguoidung nhomnguoidung) {
        return nhomNguoiDungRespository.save(nhomnguoidung);
    }

    public List<Nhomnguoidung> getAllNhomNguoiDung() {
        return nhomNguoiDungRespository.findAll();
    }

    public Nhomnguoidung getNhomNguoiDungId(String id) {
        return nhomNguoiDungRespository.findById(id).orElse(null);
    }

}
