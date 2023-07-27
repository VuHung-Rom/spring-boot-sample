package com.example.Hungvv.controller;

import com.example.Hungvv.entity.Nhanvien;
import com.example.Hungvv.entity.Nhomnguoidung;
import com.example.Hungvv.service.NhanVienService;
import com.example.Hungvv.service.NhomNguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("nhomnguoidung")
public class NhomNguoiDungController {
    @Autowired
    private NhomNguoiDungService nhomNguoiDungService;

    @PostMapping("/create")
    public ResponseEntity<?> createNhomNguoiDung(@RequestBody Nhomnguoidung nhomnguoidung) {
        Nhomnguoidung createNhomNguoiDung = nhomNguoiDungService.createNhomNguoiDung(nhomnguoidung);
        return ResponseEntity.status(HttpStatus.CREATED).body(createNhomNguoiDung);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateNhomNguoiDung(@RequestBody Nhomnguoidung nhomnguoidung) {
        Nhomnguoidung updateNhomNguoiDung = nhomNguoiDungService.updateNhomNguoiDung(nhomnguoidung);
        return ResponseEntity.ok(updateNhomNguoiDung);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllNhomNguoiDung() {
        List<Nhomnguoidung> nhomnguoidungs = nhomNguoiDungService.getAllNhomNguoiDung();
        return ResponseEntity.ok(nhomnguoidungs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getNhomNguoiDungId(@PathVariable("id") String id) {
        Nhomnguoidung nhomnguoidung = nhomNguoiDungService.getNhomNguoiDungId(id);
        if (nhomnguoidung == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(nhomnguoidung);
    }
}
