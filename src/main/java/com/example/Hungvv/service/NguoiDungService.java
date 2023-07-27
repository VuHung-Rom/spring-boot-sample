package com.example.Hungvv.service;

import com.example.Hungvv.comon.Util;
import com.example.Hungvv.entity.Nguoidung;
import com.example.Hungvv.respository.NguoiDungRespository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import static com.example.Hungvv.comon.Util.sha256;

@Service
@Validated
public class NguoiDungService {


    @Autowired
    private NguoiDungRespository nguoiDungRepository;


    // API create Nguoi_dung
    public void createNguoiDung(@NotNull Nguoidung nguoiDung) {
        try {
            // Mã hóa mật khẩu trước khi lưu vào cơ sở dữ liệu
            String hashedPassword = sha256(nguoiDung.getMatkhau());
            nguoiDung.setMatkhau(hashedPassword);
            nguoiDungRepository.save(nguoiDung);
        } catch (NoSuchAlgorithmException e) {
            // Xử lý exception nếu cần thiết
            e.printStackTrace();
        }
    }

    // API update Nguoi_dung
    public void updateNguoiDung(Nguoidung nguoiDung) {
        nguoiDungRepository.save(nguoiDung);
    }

    // API select Nguoi_dung by Ten
    public List<Nguoidung> findNguoiDungByName(String ten) {
        return nguoiDungRepository.findNguoiDungByName(ten);
    }

    // API check password Nguoi_dung
    public boolean checkPassword(String ten, String matkhau) {
        List<Nguoidung> nguoidungs = nguoiDungRepository.findNguoiDungByName(ten);
        if (!nguoidungs.isEmpty()) {
            Nguoidung nguoiDung = nguoidungs.get(0);
            String hashedPassword = null;
            try {
                hashedPassword = sha256(matkhau); // Băm mật khẩu nhập vào
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            return nguoiDung.getMatkhau().equals(hashedPassword); // So sánh mật khẩu đã băm với mật khẩu trong cơ sở dữ liệu
        }
        return false;
    }
}


