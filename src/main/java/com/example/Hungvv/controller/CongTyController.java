package com.example.Hungvv.controller;

import com.example.Hungvv.entity.Congty;
import com.example.Hungvv.service.CongTyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/congty")
public class CongTyController {
    @Autowired
    private CongTyService congTyService;

    @PostMapping("/create")
    public ResponseEntity<?> createCongty(@RequestBody Congty congty) {
        if (congTyService.isTenCongtyUnique(congty.getTenct())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Tên công ty đã tồn tại.");
        }

        // Tạo mã công ty theo quy tắc CT + id
        String mact = generateMact(congty.getMact());
        congty.setMact(mact);

        congTyService.createCongty(congty);
        return ResponseEntity.status(HttpStatus.CREATED).body("Tạo công ty thành công.");
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateCongty(@RequestBody Congty congty) {
        if (!congTyService.isTenCongtyUnique(congty.getTenct())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Công ty không tồn tại.");
        }
        congTyService.updateCongty(congty);
        return ResponseEntity.ok("Cập nhật công ty thành công.");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Congty>> getAllCongty() {
        List<Congty> congtyList =  congTyService.getAllCongty();
        return ResponseEntity.ok(congtyList);
    }

    @GetMapping("/{mact}")
    public ResponseEntity<?> findCongtyByMact(@PathVariable("mact") String mact) {
        Congty congty = congTyService.findCongtyByMact(mact);
        if (congty == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìm thấy công ty.");
        }
        return ResponseEntity.ok(congty);
    }

    private String generateMact(String id) {
        try {
            int num = Integer.parseInt(id);
            String formattedId = (num < 1000) ? String.format("%04d", num) : String.valueOf(num);
            return "CT" + formattedId;
        } catch (NumberFormatException e) {
            return id; // Nếu không phải số, trả về mã công ty như cũ
        }
    }
}



