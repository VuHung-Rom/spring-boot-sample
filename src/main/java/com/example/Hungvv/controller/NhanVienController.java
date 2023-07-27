package com.example.Hungvv.controller;

import com.example.Hungvv.entity.*;
import com.example.Hungvv.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("nhanvien")
public class NhanVienController {


    @Autowired
    private  NhanVienService nhanvienService;

    @PostMapping("/create")
    public ResponseEntity<?> createNhanvien(@RequestBody Nhanvien nhanvien) {
        Nhanvien createdNhanvien = nhanvienService.createNhanvien(nhanvien);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdNhanvien);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateNhanvien(@RequestBody Nhanvien nhanvien) {
        Nhanvien updatedNhanvien = nhanvienService.updateNhanvien(nhanvien);
        return ResponseEntity.ok(updatedNhanvien);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllNhanviens() {
        List<Nhanvien> nhanviens = nhanvienService.getAllNhanviens();
        return ResponseEntity.ok(nhanviens);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getNhanvienById(@PathVariable("id") String id) {
        Nhanvien nhanvien = nhanvienService.getNhanvienById(id);
        if (nhanvien == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(nhanvien);
    }

}

