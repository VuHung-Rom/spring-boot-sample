package com.example.Hungvv.controller;

import com.example.Hungvv.comon.Util;
import com.example.Hungvv.entity.Nguoidung;
import com.example.Hungvv.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

@RestController
public class NguoiDungController {
    @Autowired
    private NguoiDungService nguoiDungService;

    // API create Nguoi_dung
    @PostMapping("/nguoidung/create")
    public ResponseEntity<?> createNguoiDung(@RequestBody Nguoidung nguoiDung) {
        try {
            // Thực hiện tạo người dùng và mã hóa mật khẩu trước khi lưu vào cơ sở dữ liệu
            nguoiDungService.createNguoiDung(nguoiDung);
            return ResponseEntity.status(HttpStatus.CREATED).body("Tạo thành công");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Đã xảy ra lỗi");
        }
    }

    // API update Nguoi_dung
    @PutMapping("/nguoidung/update")
    public ResponseEntity<String> updateNguoiDung(@RequestBody Nguoidung nguoiDung) {
        nguoiDungService.updateNguoiDung(nguoiDung);
        return ResponseEntity.ok("Đã cập nhật thông tin Người dùng thành công!");
    }

    // API select Nguoi_dung by Ten
    @GetMapping("/nguoidung/select")
    public ResponseEntity<List<Nguoidung>> findNguoiDungByName(@RequestParam("ten") String ten) {
        List<Nguoidung> nguoidungs = nguoiDungService.findNguoiDungByName(ten);
        if (!nguoidungs.isEmpty()) {
            return ResponseEntity.ok(nguoidungs);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // API check password Nguoi_dung
    @PostMapping("/nguoidung/check_password")
    public ResponseEntity<String> checkPassword(@RequestBody Map<String, String> credentials) {
        String ten = credentials.get("ten");
        String matkhau = credentials.get("matkhau");
        if (matkhau == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Mật khẩu không được trống.");
        }

        if (nguoiDungService.checkPassword(ten, matkhau)) {
            return ResponseEntity.ok("Mật khẩu đúng!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Mật khẩu không đúng!");
        }
    }
}



